package com.dip.org.Controller;
import com.dip.org.OrgApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dip.org.entity.Customer;
import com.dip.org.respository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    private static final Logger log = LoggerFactory.getLogger(OrgApplication.class);

    @GetMapping("")
    public String index(){
        return "index";
    }



    @GetMapping("cprocess")
    @ResponseBody
    public String process(){
        // save a few customers
        repository.save(new Customer("Jack", "Bauer",20));
        repository.save(new Customer("Chloe", "O'Brian",20));
        repository.save(new Customer("Kim", "Bauer",40));
        repository.save(new Customer("David", "Palmer",50));
        repository.save(new Customer("Michelle", "Dessler",30));

        // fetch all customers
        log.info("Customers found with findAll():");
        log.info("-------------------------------");
        for (Customer customer : repository.findAll()) {
            log.info(customer.toString());
        }
        log.info("");

        // fetch an individual customer by ID
        Customer customer = repository.findById(1L);
        log.info("Customer found with findById(1L):");
        log.info("--------------------------------");
        log.info(customer.toString());
        log.info("");

        // fetch customers by last name
        log.info("Customer found with findByLastName('Bauer'):");
        log.info("--------------------------------------------");
        repository.findByLastName("Bauer").forEach(bauer -> {
            log.info(bauer.toString());
        });
        // for (Customer bauer : repository.findByLastName("Bauer")) {
        //  log.info(bauer.toString());
        // }
        log.info("");

        return "process suc";
    }
}
