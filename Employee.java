import java.util.*;

public class Employee {
    double salary;
    String holiday;
    int years;
    String lastName,birthDate,firstName;

    public Employee(double salary, String holiday, int years, String lastName, String birthDate, String firstName) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.birthDate = birthDate;
    	this.salary = salary;
        this.holiday = holiday;
        this.years = years;
       
    }
    String getDataView(){
        return (this.firstName+" "+this.lastName+" "+this.birthDate+" "+this.salary+" "+this.holiday+" "+this.years);
    }
}

