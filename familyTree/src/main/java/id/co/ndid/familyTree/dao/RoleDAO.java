package id.co.ndid.familyTree.dao;

import id.co.ndid.familyTree.model.Role;
import id.co.ndid.familyTree.model.RoleMap;

import java.util.List;


public interface RoleDAO {

	List<Role> findAll();
	Role findByName(String type);
	Role findById(int id);
	List<RoleMap> findRoleMaps(int roleId);
}
