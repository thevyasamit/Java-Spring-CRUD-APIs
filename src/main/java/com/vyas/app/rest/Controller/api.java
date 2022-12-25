package com.vyas.app.rest.Controller;
import org.hibernate.usertype.UserCollectionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @PutMapping(value = "/update/{uid}")
    public String updateOperation(@PathVariable long uid, @RequestBody users user){
        users updateuser = uR.findById(uid).get();
        updateuser.setfname(user.getfname());
        updateuser.setlname(user.getlname());
        updateuser.setAge(user.getAge());
        updateuser.setPreference(user.getPreference());
        updateuser.setBudget(user.getBudget());
        uR.save(updateuser);
        return "Update done!!";

    }

    @DeleteMapping(value = "/delete/{uid}")
    public String deletUser(@PathVariable long uid){
        users deleteUser = uR.findById(uid).get();
        uR.delete(deleteUser);
        return "user deleted with id: "+ uid;
    }

}
