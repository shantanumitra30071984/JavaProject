package org.test.restapi.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Profile {
private long id;
public Profile() {
	super();
	// TODO Auto-generated constructor stub
}
public Profile(long id, String profileName, String firstName, String lastName, Date created) {
	super();
	this.id = id;
	this.profileName = profileName;
	this.firstName = firstName;
	this.lastName = lastName;
	this.created = created;
}
private String profileName;
private String firstName;
private String lastName;
private Date created;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getProfileName() {
	return profileName;
}
public void setProfileName(String profileName) {
	this.profileName = profileName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Date getCreated() {
	return created;
}
public void setCreated(Date created) {
	this.created = created;
}
}
