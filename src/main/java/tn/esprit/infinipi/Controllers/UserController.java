package tn.esprit.infinipi.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.infinipi.entities.User;
import tn.esprit.infinipi.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public void addUserByForm(@RequestBody User user){
        userService.addUser(user);
    }


    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user) {

       return userService.updateUser(user);
    }

    @PostMapping(value = "saveUser")
    public void addNewUser(@RequestBody User user) {

        userService.saveUser(user);

    }
    @GetMapping(value = "getUsers")

    public List<User> fetchUsers(){

        return userService.getAllUser();
    }
    @DeleteMapping(value = "deleteUser/{id}")
    public void deleteUser(@PathVariable(value="id") int id) {
        System.out.println("At delete User");
        userService.deleteUser(id);


    }
}
