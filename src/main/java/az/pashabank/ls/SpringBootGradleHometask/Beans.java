package az.pashabank.ls.SpringBootGradleHometask;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
    public Customer getCustomer(){
        return new Customer("someCustomer");
    }

    @Bean
    public Account getAccount(Customer customer){
        return new Account(customer);
    }
}
