package project.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import project.hrms.entities.abstracts.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name="activation_code")
public class VerificationCode extends User{
	
	@Column(name = "id")
	private String id;
	
	@Column(name = "activation_code")
	private boolean activationCode;
	
	@Column(name= "is_confirmed")
	private boolean isConfirmed;
	
	@Column(name="confirm_date")
	private boolean confirmDate;
	
}
