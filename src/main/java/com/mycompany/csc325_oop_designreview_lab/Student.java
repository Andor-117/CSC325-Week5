
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Owen Wurster
 */
public class Student extends Human {
    
    private float GPA;
    private int credits;

    public Student(String string, short s, int c) {
        super(string, s);
        this.GPA = 0;
        this.credits = c;
    }

    // Returns the address
    @Override
    public String getAddress() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Sets the address
    @Override
    public void setAddress(String address) {
        throw new UnsupportedOperationException("Not supported yet.");
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