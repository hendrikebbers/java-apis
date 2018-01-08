package com.canoo.annotations.dataform;

import com.canoo.annotations.dataform.annotations.AttributeAnnotation;
import com.canoo.annotations.dataform.annotations.DataAnnotation;

@DataAnnotation(name= "Benutzer", description = "Ein Benutzer des Systems")
public class User {

    @AttributeAnnotation("Vorname")
    private String firstName;

    @AttributeAnnotation("Nachname")
    private String lastName;

    @AttributeAnnotation("E-Mail")
    private String mail;

    @AttributeAnnotation("Aktiv")
    private boolean active;

    @AttributeAnnotation("Alter")
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
