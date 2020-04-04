package model;

import java.time.LocalDate;

public class Blog{
	String title;
	String description;
	LocalDate postedOn;


public String gettitle() {
	return title;
}

public void settitle(String title) {
	this.title=title;
}
public String getdescription() {
	return description;
}
public void setdescription(String description) {
	this.description=description;
}
public LocalDate getpostedOn() {
	return postedOn;
}
public void setpostedOn(LocalDate postedOn) {
	this.postedOn=postedOn;
}

public Blog(String title, String description, LocalDate postedOn) {
	super();
	this.title = title;
	this.description = description;
	this.postedOn = postedOn;
}

public Blog() {
	super();
}

}