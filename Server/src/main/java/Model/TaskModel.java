package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import java.util.*;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Taskmodel")
public class TaskModel {

	private int id;
	private String title;
	private String description;
	private Date duedate;
	private boolean status;
	
	public TaskModel()
	{
		
	}	
	
	public TaskModel(int id, String title, String description, Date duedate, boolean status) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.duedate = duedate;
		this.status = status;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="Title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Column(name="Description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name="Duedate")
	public Date getDuedate() {
		return duedate;
	}
	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}
	
	@Column(name="Status")
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
