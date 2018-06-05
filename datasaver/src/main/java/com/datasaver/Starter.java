package com.datasaver;

import com.datasaver.front.MainMenu;
import com.datasaver.save.TestSavings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


public class Starter {

        public static void main(String[] args) {
            MainMenu mainMenu=new MainMenu();
            mainMenu.setVisible(true);
        }
}
