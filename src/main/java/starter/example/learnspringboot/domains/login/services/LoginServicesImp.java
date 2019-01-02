package starter.example.learnspringboot.domains.login.services;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;
import starter.example.learnspringboot.dto.LoginDTO;

import java.util.Date;

@Service
public class LoginServicesImp implements LoginServices {
    private static final String secret = "tak1234";
    @Override
    public String authLogin (String username, String password) {
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
