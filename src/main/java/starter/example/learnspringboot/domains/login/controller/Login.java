package starter.example.learnspringboot.domains.login.controller;

import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.jsonwebtoken.Jwts;
import starter.example.learnspringboot.dto.LoginDTO;

import java.util.Date;

@RestController
@RequestMapping("/api/login")
public class Login {
    private static final String secret = "tak1234";
    @GetMapping(params = {"username", "password"})
    public String LoginController (@RequestParam("username") String username, @RequestParam("password") String password) {
        LoginDTO user = new LoginDTO();
        user.setUserId(1);
        user.setName(username);
        String jwt = Jwts
                .builder()
                .setSubject(password)
                .claim("userId", user.getUserId())
                .claim("name", user.getName())
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
        return jwt;
    }
}
