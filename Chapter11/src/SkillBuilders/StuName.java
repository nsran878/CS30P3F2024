package SkillBuilders;
import java.io.Serializable;

//Class representing a student's name
class StuName implements Serializable {
 private static final long serialVersionUID = 1L;
 private String firstName;
 private String lastName;

 // Constructor
 public StuName(String firstName, String lastName) {
     this.firstName = firstName;
     this.lastName = lastName;
 }

 // Override toString for easy printing
 @Override
 public String toString() {
     return firstName + " " + lastName;
 }
}
