
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Owner
 */
public class Senior extends Student{
    
    private int credits;
    
    public Senior(String string, short s, int c) throws BadArgumentException {
        super(string, s);
        this.credits = c;
        
        if (credits < 85)
            throw new BadArgumentException("Senior credits must be greater than 84");
    }
    
    public int getCredits () {
        return this.credits;
    }
}
