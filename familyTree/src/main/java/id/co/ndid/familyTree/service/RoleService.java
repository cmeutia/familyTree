package id.co.ndid.familyTree.service;

import id.co.ndid.familyTree.model.Role;
import id.co.ndid.familyTree.model.RoleMap;

import java.util.List;


public interface RoleService {

	Role findById(int id);

	Role findByName(String type);
	
	List<Role> findAll();
	
	List<RoleMap> findRoleMaps(int roleId);
}
