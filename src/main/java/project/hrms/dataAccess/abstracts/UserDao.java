package project.hrms.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;

import project.hrms.entities.abstracts.User;

public interface UserDao extends JpaRepository<User, Integer> {

}

