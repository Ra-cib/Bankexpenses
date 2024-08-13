package com.personalbank.personalbank.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.personalbank.personalbank.model.User;

public interface UserRepository  extends JpaRepository<User,Integer>{

}
