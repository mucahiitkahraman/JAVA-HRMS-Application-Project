package project.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import project.hrms.entities.abstracts.User;


@Entity
@Table(name="candidates")
@Data
@EqualsAndHashCode(callSuper = false)
public class Candidate extends User {
	
	@Id
	@Column(name="id")
	@PrimaryKeyJoinColumn
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "national_identy")
	private String nationalIdentity;
	
	@Column(name = "date_of_birth")
	private Date dateOfBirth;  
	
	
}
