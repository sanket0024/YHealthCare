/**
 * @author Sanket Mathur
 * @date 11 Aug 2018
 *
 * Company: YHC
 */

package s2018.yhcmain.healthcare.domainObjects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * User domain object
 */

@Entity
public class User {

	@Id
	private String id;

	@Column(nullable=false, length=50)
	private String firstName;

	@Column(nullable=false, length=50)
	private String lastName;

	@Column(nullable=false, length=30, unique=true)
	private String email;

	@Column(nullable=false, length=20)
	private String password;

	@Column(nullable=false, length=20)
	private String role;

	@Column(nullable=false, length=1)
	private String active;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id=id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName=lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email=email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password=password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role=role;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active=active;
	}
}
