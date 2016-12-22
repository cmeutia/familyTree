package id.co.ndid.familyTree.service.impl;

import id.co.ndid.familyTree.dao.RoleDAO;
import id.co.ndid.familyTree.model.Role;
import id.co.ndid.familyTree.model.RoleMap;
import id.co.ndid.familyTree.service.RoleService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	RoleDAO roleDAO;
	
	public Role findById(int id) {
		return roleDAO.findById(id);
	}

	public Role findByName(String name){
		return roleDAO.findByName(name);
	}

	public List<Role> findAll() {
		return roleDAO.findAll();
	}

	public List<RoleMap> findRoleMaps(int roleId) {
		return roleDAO.findRoleMaps(roleId);
	}
}
