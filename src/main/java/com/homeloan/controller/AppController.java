package com.homeloan.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.homeloan.entity.User;
import com.homeloan.repo.UserRepository;

@Controller
public class AppController {
 
    @Autowired
    private UserRepository userRepo;
    
    float rate = 7/(12*100);
     
    @GetMapping("/")
    public String viewHomePage() {
        return "index";
    }
    
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
         
        return "signup_form"; 
    }
    
    
    
    @PostMapping("/process_register")
    public String processRegister(User user) {
        userRepo.save(user);
    	if(user.getLoan_amount() < (50*user.getMonthly_salary()) || user.getLoan_amount() == (50*user.getMonthly_salary())) {
    		userRepo.updateApplicationStatus(user.getUsername(),user.getApplication_status(),user.getPayment_status());
    		
    	}
    	else {
    		userRepo.updateApplicationStatusFalse(user.getUsername());
    		
    	}
         
        return "register_sucess";
    }
    
    @GetMapping("/login")
    public String showLogin(Model model) {
        model.addAttribute("user", new User());
         
        return "login"; 
    }
    
    
    
    
    @PostMapping("login")
    public String loginStatus(User user) {
    	 User newUser = userRepo.findByUsernamePassword(user.getUsername(), user.getPassword());
    	 System.out.println(newUser.getMonthly_salary());
    	if(Objects.nonNull(newUser))  
    	{	 
    		return userRepo.findStatus(newUser.getUsername());
    	
    		
    	} else {
    		return "redirect:/";
    		
    	
	}
    }
    
    	
    	
    
  
    
}