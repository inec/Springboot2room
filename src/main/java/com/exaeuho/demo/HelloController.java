package com.exaeuho.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
//@RequestMapping("/api")
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Sprig Boot!";
    }
   
   @GetMapping("/greeting")
   public String greeting(){
                return "HHH";
            }
    
}

   /*
        
        public class ApiController{
           
            public String getGreeting(){
                return "HHH";
            }
        }
	}*/