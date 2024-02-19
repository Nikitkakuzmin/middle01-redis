package kz.nik.middle01redis.redis.api;


import jakarta.servlet.http.HttpSession;
import kz.nik.middle01redis.redis.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class SessionController {

    @GetMapping
    public String welcomePage() {
        return "Welcome Page";
    }

    @GetMapping(value = "/session")
    public String getSession(HttpSession session) {
        return "session : " + session;
    }

    @GetMapping(value = "/setup/{name}")
    public String setup(@PathVariable(name = "name") String name, HttpSession session) {
        session.setAttribute("userName", name);
        return "saved";
    }

    @GetMapping(value = "/current-user")
    public String getCurrentUser(HttpSession session) {
        return (String) session.getAttribute("userName");
    }

    @PostMapping(value = "/add-item")
    public String addItem(@RequestBody Product product, HttpSession session) {
        ArrayList<Product> productList;
        Object sessionObject = session.getAttribute("products");
        if (sessionObject == null) {
            productList = new ArrayList<>();
        } else {
            productList = (ArrayList<Product>) sessionObject;
        }
        productList.add(product);
        session.setAttribute("products", productList);
        return "saved";
    }

    @GetMapping(value = "/list-item")
    public ArrayList<Product> listItems(HttpSession session) {
        ArrayList<Product> productList;
        Object sessionObject = session.getAttribute("products");
        if (sessionObject == null) {
            productList = new ArrayList<>();
        } else {
            productList = (ArrayList<Product>) sessionObject;
        }
        return productList;
    }
}


   /* @GetMapping(value = "/add-item")
    public String addItem( HttpSession session,
                           @RequestParam(name = "name") String name,
                           @RequestParam(name = "price") Integer price,
                           @RequestParam(name = "color") String color,
                           @RequestParam(name = "id") Long id
                           ) {
        ArrayList<Product> productList;
        Object sessionObject = session.getAttribute("products");
        if (sessionObject == null) {
            productList = new ArrayList<>();
        } else {
            productList = (ArrayList<Product>) sessionObject;
        }

        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setPrice(price);
        product.setColor(color);

        productList.add(product);
        session.setAttribute("products", product);
        return "save";

    }*/

