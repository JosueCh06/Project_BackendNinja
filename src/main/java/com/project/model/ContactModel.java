package com.project.model;

public class ContactModel {

	private int idcontact;
	private String firstname;
	private String lastname;
	private String telephone;
	private String city;

	public int getIdcontact() {
		return idcontact;
	}

	public void setIdcontact(int idcontact) {
		this.idcontact = idcontact;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public ContactModel(int idcontact, String firstname, String lastname, String telephone, String city) {
		super();
		this.idcontact = idcontact;
		this.firstname = firstname;
		this.lastname = lastname;
		this.telephone = telephone;
		this.city = city;
	}

	public ContactModel() {
	}

	@Override
	public String toString() {
		return "ContactModel [idcontact=" + idcontact + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", telephone=" + telephone + ", city=" + city + "]";
	}
	
	

}
