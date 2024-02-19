package kz.nik.middle01redis.redis.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserData {

    private String login;
    private String fullName;

}