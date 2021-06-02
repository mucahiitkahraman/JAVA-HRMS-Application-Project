package project.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import project.hrms.entities.abstracts.Entities;
import project.hrms.entities.abstracts.User;

@Entity
@Table(name="employees")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Employee extends User implements Entities {
	@Id
	@Column(name="id")
	@PrimaryKeyJoinColumn
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	
}
