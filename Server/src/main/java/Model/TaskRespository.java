package Model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  TaskRespository extends CrudRepository<TaskModel, Integer> {
	
	List<TaskModel> findAll();
	List<TaskModel> findByid();

}
