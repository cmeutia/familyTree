package id.co.ndid.familyTree.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rolemap")
public class RoleMap implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="role_id", nullable=false)
	private int roleId;
	
	@Column(name="rights_id", nullable=false)
	private int rights_id;
	
	@Column(name="status", nullable=false)
	private String status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	public int getRights_id() {
		return rights_id;
	}
	public void setRights_id(int rights_id) {
		this.rights_id = rights_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "RoleMap [id=" + id + ", roleId=" + roleId + ", rights_id="
				+ rights_id + ", status=" + status + "]";
	}
	
			
}
