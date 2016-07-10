package lannisi.sample.service.dao;

import java.util.List;

import lannisi.sample.service.model.User;


public interface UserDao {

	List<User> findAll();
}
