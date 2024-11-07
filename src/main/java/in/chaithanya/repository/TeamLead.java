package in.chaithanya.repository;

import org.springframework.data.repository.CrudRepository;

import in.chaithanya.entity.Manager;



public interface TeamLead extends CrudRepository<Manager, Integer> {

	

}
