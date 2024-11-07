package in.chaithanya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.chaithanya.entity.Manager;
import in.chaithanya.repository.TeamLead;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		TeamLead teamLead=context.getBean(TeamLead.class);
		
		Manager m=new Manager();
		
		  m.setManagerId(1); 
		  m.setManagerName("kancherla manasa");
		  teamLead.save(m);
		 
		
		
		System.out.println("data stored in database..........");
	}

}
