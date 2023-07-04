package comy.groupy.artifacty.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	
	@Id
	@SequenceGenerator(name="id_s",sequenceName = "id_s",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "id_s")
	@Column(name = "stud_id")
	private Long studId;
	@Column(name = "stud_name")
	private String studName;
	private String dob;
	private String gender;
	private String password;
	private String email;
	@Override
	public String toString() {
		return "Student [studName=" + studName + ", dob=" + dob + ", gender=" + gender
				+ ", password=" + password + ", email=" + email + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Long studId, String studName, String dob, String gender, String password, String email) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.dob = dob;
		this.gender = gender;
		this.password = password;
		this.email = email;
	}
	public Long getStudId() {
		return studId;
	}
	public void setStudId(Long studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
