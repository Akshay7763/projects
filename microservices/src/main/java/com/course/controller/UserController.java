package com.course.controller;

import com.course.model.User;
import com.course.service.UserService;
import com.course.utile.userNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Locale;


@RestController
public class UserController {
    @Autowired
    UserService userService;

    private MessageSource messageSource;

    public UserController(MessageSource messageSource){
        this.messageSource= messageSource;
    }

    @GetMapping("/allUser")
    ResponseEntity<List<User>> getAllUser(){
        List<User> users = userService.getAllUser();
        return new ResponseEntity<List<User>>(users,HttpStatus.OK);
    }

    @GetMapping("/getUser/{id}")
    public EntityModel<User> getUser(@PathVariable("id") int id){
    	

        User user = userService.getUser(id);
        if(user == null)
        	throw new userNotFoundException("id:"+id);
            EntityModel<User> entityModel = EntityModel.of(user);

            WebMvcLinkBuilder link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getAllUser());

            entityModel.add(link.withRel("All-users"));

        return entityModel;
            }

    @PostMapping(path ="/registerUser", headers = "version1")
    ResponseEntity<User> registerUserHeaders(@Validated @RequestBody User user){
    	
    	User registerUser =userService.registerUser(user);
    	
    	URI locationUri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(registerUser.getUserId()).toUri();
    
    	
		return ResponseEntity.created(locationUri).build();
    	
    }
    @PostMapping(path ="/registerUser", headers = "version2")
    ResponseEntity<User> registerUser(@Validated @RequestBody User user){

        User registerUser =userService.registerUser(user);

        URI locationUri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(registerUser.getUserId()).toUri();


        return ResponseEntity.created(locationUri).build();

    }
    @DeleteMapping("/deleteUser/{id}")
    public void deleteUserbyId(@PathVariable("id") int id){
    	

         userService.deletUser(id);
        


    }
    @GetMapping(value="/globalization")
    public String globalization(){
    Locale locale = LocaleContextHolder.getLocale();
    //Not getting the desired message.default messege is working here.
        return messageSource.getMessage("good.morning.message",null,"default message",locale);
    }
}

