
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Owen Wurster
 */
public class Student extends Human {
    
    private float GPA;

    public Student(String string, short s) {
        super(string, s);
        this.GPA = 0;
    }

    // Returns the address
    @Override
    public String getAddress() {
        return address;
    }

    // Sets the address
    @Override
    public void setAddress(String a) {
        this.address = a;
    }

    // Sets the gpa
    public void setGPA (float gpa) {
        this.GPA = gpa;
    }
    
    // Returns the gpa
    public float getGPA () {
        return GPA;
    }

}