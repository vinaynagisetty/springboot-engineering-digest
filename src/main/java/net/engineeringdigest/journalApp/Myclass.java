package net.engineeringdigest.journalApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myclass {
    @GetMapping("greeting")
    public String Greeting(){
        return "Hello from vinay";
    }
}
