package com.educandoweb.course.config;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.OrderRepository;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    
        @Autowired
        private UserRepository userRepository;

        @Autowired
        private OrderRepository orderRepository;

        @Override
        public void run(String... args) throws Exception {
            // TODO Auto-generated method stub
            
            User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
            User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
            User u3 = new User(null, "John Doe", "john@gmail.com", "966666666", "123456");
            User u4 = new User(null, "Alice Smith", "alice@gmail.com", "955555555", "123456");
            User u5 = new User(null, "Bob Johnson", "bob@gmail.com", "944444444", "123456");
            User u6 = new User(null, "Eva White", "eva@gmail.com", "933333333", "123456");
            User u7 = new User(null, "Charlie Black", "charlie@gmail.com", "922222222", "123456");
            User u8 = new User(null, "Olivia Davis", "olivia@gmail.com", "911111111", "123456");
            User u9 = new User(null, "Daniel Lee", "daniel@gmail.com", "900000000", "123456");
    
            List<User> userList = Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9);           
           


        Order o1 = new Order(null, Instant.parse("2019-06-20T19:40:53.07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2019-06-20T19:40:53.07Z"), u3);
        Order o3 = new Order(null, Instant.parse("2019-06-20T19:40:53.07Z"), u1);
        Order o4 = new Order(null, Instant.parse("2019-06-20T19:40:53.07Z"), u3);
        Order o5 = new Order(null, Instant.parse("2019-06-20T19:40:53.07Z"), u2);
        Order o6 = new Order(null, Instant.parse("2019-06-20T19:40:53.07Z"), u2);
        Order o7 = new Order(null, Instant.parse("2019-06-20T19:40:53.07Z"), u3);
        Order o8 = new Order(null, Instant.parse("2019-06-20T19:40:53.07Z"), u1);
        Order o9 = new Order(null, Instant.parse("2019-06-20T19:40:53.07Z"), u2);

        List<Order> orderList = Arrays.asList(o1, o2, o3, o4, o5, o6, o7, o8, o9);
        // Salve a lista de usuários usando saveAll
        userRepository.saveAll(userList);
        orderRepository.saveAll(orderList);
        
        }


}
