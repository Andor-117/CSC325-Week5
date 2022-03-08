
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Owen Wurster
 */
public class Senior extends Student{
    
    final private int credits;
    
    public Senior(String string, short s, int c) throws BadArgumentException {
        super(string, s);
        this.credits = c;
        
        if (credits < 85)
            throw new BadArgumentException("Senior credits must be greater than 84");
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
