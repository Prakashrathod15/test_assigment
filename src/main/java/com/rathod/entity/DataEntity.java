package com.rathod.entity;


@Entity
public class DataEntity {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private int endYear;
 private String city;
 private String country;
 
public DataEntity(Long id, int endYear, String city, String country) {
	super();
	this.id = id;
	this.endYear = endYear;
	this.city = city;
	this.country = country;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public int getEndYear() {
	return endYear;
}

public void setEndYear(int endYear) {
	this.endYear = endYear;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}


 
 
 
 
}

//Create a Repository for the Entity, e.g., DataRepository.java
public interface DataRepository extends JpaRepository<DataEntity, Long> {
 // Define custom query methods for filtering data (by endYear, topic, etc.) if needed.
}
