package project.hrms.core.dataAccess;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends JpaRepository<User, Integer>{
	
	User findById(User user);
	User findUserByEmail(String email);
	
}
