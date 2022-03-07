
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    
    private float GPA;

    public Student(String string, short s, float gpa) {
        super(string, s);
        this.GPA = gpa;
    }

    @Override
    public String getAddress() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setAddress(String address) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
	
    
	// ToDo 3: Add a field for GPA and create setter and getter
    public void setGPA (float gpa) {
        this.GPA = gpa;
    }
    
    public float getGPA () {
        return GPA;
    }
	
	// ToDo 4: Add comments to your code

}