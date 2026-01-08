package com.kisanmitra.Controllers;

import com.kisanmitra.models.User;
import com.kisanmitra.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/KisanMitra/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/signup")
    public User create(@RequestBody User user) {
        return service.saveUser(user);
    }

    @GetMapping
    public List<User> getAll() {
        return service.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Integer id) {
        return service.getUserById(id);
    }

    @DeleteMapping("/{id}")
    public String delUser(
            @PathVariable("id") int id
    ){
        service.deleteUser(id);
        return "User with id: "+id+ "deleted!";
    }
}
