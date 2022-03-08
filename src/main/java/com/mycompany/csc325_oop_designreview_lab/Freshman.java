
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
}
