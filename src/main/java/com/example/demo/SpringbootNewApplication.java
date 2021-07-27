package com.example.demo;

import com.example.demo.enumerators.ConstantesStr;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.logging.Logger;

@SpringBootApplication
public class SpringbootNewApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootNewApplication.class, args);
        openHomePage();
    }

    private static final Logger logger = Logger.getLogger(SpringbootNewApplication.class.getName());

    private static void openHomePage() {
        Runtime rt = Runtime.getRuntime();
        try {
            rt.exec(ConstantesStr.COMMAND_OPEN_CHROME.toString());
        } catch (IOException e) {
            logger.severe(e.getMessage());
        }
    }

}
