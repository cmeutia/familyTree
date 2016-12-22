package id.co.ndid.familyTree.converter;

import id.co.ndid.familyTree.model.Role;
import id.co.ndid.familyTree.service.RoleService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * A converter class used in views to map id's to actual userProfile objects.
 */
@Component
public class RoleConverter implements Converter<Object, Role>{

	static final Logger logger = LoggerFactory.getLogger(RoleConverter.class);
	
	@Autowired
	RoleService roleService;

	/**
	 * Gets UserProfile by Id
	 * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
	 */
	public Role convert(Object element) {
		Integer id = Integer.parseInt((String)element);
		Role role = roleService.findById(id);
		logger.info("Role : {}", role);
		return role;
	}
	
}