package net.staj.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



import net.staj.springboot.model.User;
import net.staj.springboot.repository.UserRepository;


@CrossOrigin(origins = "http://localhost:3000") 
//önyüzdeki verilerin görünürlüğü için bu satırı ekledim (CORS ile karsilasmamak icin)

@RestController
@RequestMapping("api/")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
	


    /*@GetMapping("users")
    public List < User > getUsers() {
        return this.userRepository.findAll();
    }*/
    
    @RequestMapping(value = "users", method = RequestMethod.GET) 
    public List < User > getUsers() {
        return this.userRepository.findAll();
	}
    
   /*
    @RequestMapping(value = "users/{id}", method = RequestMethod.GET) 
	public User get(@PathVariable Long id) {
		return this.userRepository.getById(id);
	}*/
    
    
    @RequestMapping(value = "users", method = RequestMethod.POST)
    public String handleRegisterForm(@Validated @ModelAttribute("user") User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "register";
        userRepository.findAll();
        return "redirect:/";
    }
    
    @RequestMapping(value = "users/{id}", method = RequestMethod.DELETE)
    public String handleItemDelete(@PathVariable Long id) {
    	userRepository.deleteById(id);
        return "Successfully deleted.";
    }
    
  /*  @RequestMapping( value = "users", method = { RequestMethod.PUT}
    		)
    		@ResponseBody
    		public String put() {
    		    return "redirect:/";
    		}*/
    
    
    @RequestMapping( value = "users", method = { RequestMethod.PUT, RequestMethod.POST }
    		)
    		@ResponseBody
    		public String putAndPostFoos() {
    		    return "Advanced - PUT and POST within single method";
    		}
    
    

}