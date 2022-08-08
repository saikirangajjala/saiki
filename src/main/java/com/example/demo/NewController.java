package com.example.demo;

import com.example.demo.entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {
    @Autowired
    NewRepository newRepository;
@RequestMapping(value = "/Login",method = RequestMethod.POST, consumes = "application/json")
public Login login(@RequestBody Login login)
{
    newRepository.save(login);
    Login allById = newRepository.findById(login.getId()).orElse(null);
    return allById;
}
}
