package net.staj.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import net.staj.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    /**
     * We extended our interface (UserRepository) from JpaRepository
     * Sorgu parametreleri olusturacak.
     * */
	
}