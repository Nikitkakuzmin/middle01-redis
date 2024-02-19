package kz.nik.middle01redis.redis;

import jakarta.servlet.http.HttpSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class RedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }

   /* @GetMapping
    public String welcomePage() {
        return "Welcome";
    }

    @GetMapping(value = "/session")
    public String getSession(HttpSession session) {
        return "session: " + session;
    }

    @GetMapping(value = "/setup/{name}")
    public String setup(@PathVariable(name = "name")String name,HttpSession session) {
        session.setAttribute("userName",name);
        return  "redirect:/";
    }

    @GetMapping(value = "/current-user")
    public String getCurrentUser(HttpSession session) {
        return (String) session.getAttribute("userName");
    }*/

}
