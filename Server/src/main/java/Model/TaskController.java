package Model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TaskController {
	
	@Autowired
	public TaskRespository repo;
	
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public List<TaskModel> getAllvalue() throws Exception {
		return repo.findAll();
	}
	
	@RequestMapping(value="/getAll/{id}",method=RequestMethod.GET)
	public List<TaskModel> getValueById() throws Exception
	{
		return repo.findByid();
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void SaveValue(@RequestBody TaskModel val) throws Exception
	{
		try {
			repo.save(val);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
	public TaskModel putMethodName(@PathVariable int id, @RequestBody TaskModel entity)
	throws Exception{
		//TODO: process PUT request
		TaskModel si = new TaskModel();
		si.setTitle(si.getTitle());
		si.setDescription(si.getDescription());
		si.setDuedate(si.getDuedate());
		return si;
	}
	
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteValue(@PathVariable int id,TaskModel entity)
	{
		repo.deleteAll();
	}
	

}
