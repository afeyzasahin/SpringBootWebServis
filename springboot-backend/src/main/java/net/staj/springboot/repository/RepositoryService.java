package net.staj.springboot.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import net.staj.springboot.model.User;

@Service
public class RepositoryService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int saveUserDetails(User user) {
		
		return jdbcTemplate.update("insert user", user.getId(), user.getAd(), user.getEmail());
	}

	public List<User> findAll() {
		return jdbcTemplate.query("select * from carts", (resultSet, rowNum) -> new User(

				resultSet.getString("name"), resultSet.getString("surname"), resultSet.getString("email"),resultSet.getString("telno")));
	}

	public int updateUserDetails(User user) {
		return jdbcTemplate.update("update UserDetail", user.getAd(), user.getId());
	}

	public int deleteUserItem(int id) {
		return jdbcTemplate.update("delete ", id);
	}
}
