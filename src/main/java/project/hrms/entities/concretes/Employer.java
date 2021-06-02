package project.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import project.hrms.entities.abstracts.User;


@Entity
@Table(name="employers")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Employer extends User {
	
	@Id
	@Column(name = "id")
	@PrimaryKeyJoinColumn
	private int id;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "web_address")
	private String webAddress;

	@Column(name = "phone_number")
	private String phoneNumber;
	
}
