package id.co.ndid.familyTree.dao;

import java.util.List;

import id.co.ndid.familyTree.model.User;


public interface UserDAO {

	User findById(int id);
	
	User findBySSO(String sso);
	
	void save(User user);
	
	void deleteBySSO(String sso);
	
	List<User> findAllUsers();

}

