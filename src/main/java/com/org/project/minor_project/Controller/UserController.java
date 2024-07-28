package com.org.project.minor_project.Controller;

import com.org.project.minor_project.DTO.UserRequest;
import com.org.project.minor_project.Model.User;
import com.org.project.minor_project.Services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addStudent")
    public User addStudent(@RequestBody @Valid UserRequest userRequest){
        return userService.addStudent(userRequest);
    }

    @PostMapping("/addAdmin")
    public User addAdmin(@RequestBody @Valid UserRequest userRequest ){
        return userService.addAdmin(userRequest);
    }

    @GetMapping("/getStudent")
    public User addStudent(){
        return  null;
    }

    @GetMapping("/filter")
    public List<User> filter(@RequestParam("filterBy") String filterBy,
                             @RequestParam("operator") String operator,
                             @RequestParam("values") String values){

        return userService.filter(filterBy, operator, values);

    }


}
