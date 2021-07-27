package net.staj.springboot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import net.staj.springboot.model.User;
import net.staj.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String [] args) throws Exception {
    	
    	this.userRepository.save(new User("Gulsah", "Varir", "gulsahvarır@gmail.com","+90 555 44 11"));
    	this.userRepository.save(new User("Gizem", "Erol", "gizemerol@gmail.com","+90 555 44 12"));
        this.userRepository.save(new User("Almina", "Kacar", "alminakacar@gmail.com","+90 555 44 13"));
        this.userRepository.save(new User("Berke", "Atmaca", "abatmc@gmail.com","+90 555 44 14"));
        this.userRepository.save(new User("Ayca", "Tanisli", "aycatanisli@gmail.com","+90 555 44 15"));
        this.userRepository.save(new User("Zulal", "Karin", "zulalkarin@gmail.com","+90 555 44 16"));
        this.userRepository.save(new User("Ece", "Dalyaman", "ecedalyaman@gmail.com","+90 555 44 17"));
        this.userRepository.save(new User("Tunc", "Sahinok", "sahinoktunc@gmail.com","+90 555 44 18"));
        this.userRepository.save(new User("Alpar", "Erbas", "alparerbas96@gmail.com","+90 555 44 19"));
        this.userRepository.save(new User("Beyza", "Sahin", "ayseyilmaz99@gmail.com","+90 555 44 20"));
        this.userRepository.save(new User("Ahmet", "Celik", "ahmetcelik98@gmail.com","+90 555 44 21"));
        this.userRepository.save(new User("Zeynep", "Sahin", "sahinzeynep@gmail.com","+90 541 44 22"));
        this.userRepository.save(new User("Zeynep", "Sahin", "sahinzeynep@gmail.com","+90 541 44 23"));
        this.userRepository.save(new User("Beyza", "Kaya", "kayabeyza@gmail.com","+90 555 44 24"));
        this.userRepository.save(new User("Kagan", "Polat", "kgnplt98p@gmail.com","+90 555 44 25"));
        this.userRepository.save(new User("Ömer", "Acar", "omracar2002@gmail.com","+90 555 44 26"));
        this.userRepository.save(new User("Zeliha", "Hacıoglu", "zelihcoglu2000@gmail.com","+90 555 44 27"));
        this.userRepository.save(new User("Nazlı", "Kara", "nazli.kaya@gmail.com","+90 555 44 28"));
        this.userRepository.save(new User("Bora", "Kidil", "bora_kidil99@gmail.com","+90 555 44 29"));
        this.userRepository.save(new User("Aleyna", "Arslan", "a.aslan97@gmail.com","+90 555 44 30"));
        
    }
    
   
   

	
}
