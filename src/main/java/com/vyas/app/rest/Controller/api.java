package com.vyas.app.rest.Controller;
import org.hibernate.usertype.UserCollectionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
// import org.springframework.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vyas.app.rest.Models.users;
import com.vyas.app.rest.Repo.userRepo;
import java.util.*;

@RestController
public class api {

    @Autowired
    private userRepo uR;

    @GetMapping(value = "/")
    public String getpage(){
        return "Welcome!!";

    }
    @GetMapping(value = "/allusers")
    public List<users> getUsers(){
        return uR.findAll();
    }

    @PostMapping(value = "/save")
    public String saveUser(@RequestBody users user){
        uR.save(user);
        return "Saved!!";

    }

}
