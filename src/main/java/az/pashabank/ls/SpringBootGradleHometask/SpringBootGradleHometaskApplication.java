package az.pashabank.ls.SpringBootGradleHometask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringBootGradleHometaskApplication {

	public static void main(String[] args) {

	     ApplicationContext context = SpringApplication.run(SpringBootGradleHometaskApplication.class, args);

	     Customer customer = (Customer) context.getBean("getCustomer");
        System.out.println(customer.getName());

        Account account = context.getBean(Account.class);
        System.out.println(account.getCustomer().getName());

	}

}
