
package com.s_square.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SSquareRestaurantApp {
    public static void main(String[] args) {
        SpringApplication.run(SSquareRestaurantApp.class, args);
    }
}

@RestController
class BurgerController {
    @GetMapping("/burgers")
    public String getBurgers() {
        return "🍔 Welcome to S Square! Try our burgers, fries, and more! 🍟✨";
    }
}
