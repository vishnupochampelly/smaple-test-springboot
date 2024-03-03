package com.example.date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    public String getDate(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDateTime = now.format(format1);
        return formattedDateTime;
    }
}
