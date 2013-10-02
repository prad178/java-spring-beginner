import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pc.repository.CustomerRepository;
import com.pc.repository.HibernateCustomerRepositoryImpl;
import com.pc.service.CustomerService;
import com.pc.service.CustomerServiceImpl;


@Configuration
public class AppConfig {
	
	@Bean(name="customerService")
	public CustomerService getCustomerService(){
		//Setter injection using JAVA configuration
		//CustomerServiceImpl customerService = new CustomerServiceImpl();
		//customerService.setCustomerRepository(getCustomerRepository());
		
		CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
		
		
		
		return customerService;
	}
	
	
	@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository(){
		return new HibernateCustomerRepositoryImpl();
	}

}
