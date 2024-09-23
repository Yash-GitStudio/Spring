package com.example.HelloWorldApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/")
public class HelloWorldController {
    @GetMapping("/date")
    public String getDateAfter100Days() {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Add 100 days to today's date
        LocalDate dateAfter100Days = today.plusDays(100);

        // Format the date in dd-MM-yyyy format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = dateAfter100Days.format(formatter);

        // Return the formatted date as the response
        return formattedDate;
    }
    @GetMapping("/name")
    public String GetName(){
        return "yash";
    }
}
