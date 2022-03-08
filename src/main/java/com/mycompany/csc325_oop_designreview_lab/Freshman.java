
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Owner
 */
public class Freshman extends Student {
    
    private int credits;
    
    public Freshman(String string, short s, int c) {
        super(string, s);
        this.credits = c;
    } 
    
    public int getCredits () {
        return this.credits;
    }
    
    public String toString () {
        String str = "Name: " + super.getName() + "\n" +
                     "Address: " + super.getAddress() + "\n" +
                     "Age: " + super.getAge() + "\n" + 
                     "Credits: " + this.getCredits() + "\n" +
                     "GPA: " + super.getGPA() + "\n";
        return str;
    }
}
