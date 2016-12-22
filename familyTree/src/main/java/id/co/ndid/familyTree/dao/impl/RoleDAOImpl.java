package id.co.ndid.familyTree.dao.impl;

import id.co.ndid.familyTree.dao.AbstractDao;
import id.co.ndid.familyTree.dao.RoleDAO;
import id.co.ndid.familyTree.model.Role;
import id.co.ndid.familyTree.model.RoleMap;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;



@Repository("userProfileDao")
public class RoleDAOImpl extends AbstractDao<Integer, Role>implements RoleDAO{

	public Role findById(int id) {
		return getByKey(id);
	}

	public Role findByName(String name) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("name", name));
		return (Role) crit.uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<Role> findAll(){
		Criteria crit = createEntityCriteria();
		crit.addOrder(Order.asc("name"));
		return (List<Role>)crit.list();
	}

	@SuppressWarnings("unchecked")
	public List<RoleMap> findRoleMaps(int roleId) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("roleId", roleId));
		return (List<RoleMap>)crit.list();
	}
	
}
