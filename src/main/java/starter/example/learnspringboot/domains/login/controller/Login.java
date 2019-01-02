package starter.example.learnspringboot.domains.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import starter.example.learnspringboot.domains.login.services.LoginServices;

@RestController
@RequestMapping("/api/login")
public class Login {
    @Autowired
    private LoginServices loginServices;
    @GetMapping(params = {"username", "password"})
    public String LoginController (@RequestParam("username") String username, @RequestParam("password") String password) {
        return loginServices.authLogin(username, password);
    }
}
