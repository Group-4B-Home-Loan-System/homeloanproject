package com.homeloan.repo;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.homeloan.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	    @Query("SELECT u FROM User u WHERE u.username = ?1 and u.password = ?2")
	    public User findByUsernamePassword(String username, String password);
	    
	    @Transactional
	    @Modifying
	    @Query("update User u set u.application_status = 'Approved', u.payment_status = 'HomeLoan' where u.id = ?1")
		public void updateApplicationStatus(String username, String application_status, String payment_status);
	    
	    @Transactional
	    @Modifying
	    @Query("update User u set u.application_status = 'Denied', u.payment_status = 'No HomeLoan' where u.id = ?1")
		public void updateApplicationStatusFalse(String username);

	    @Query("SELECT u.application_status FROM User u WHERE u.username = ?1")
		public String findStatus(String username);
	    
	    
	    
	    
	   

}
