/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {
	
	public static void main(String[] args) {

                // ToDo 10: Add a toString method for Senior class
                
		Freshman std1 = new Freshman("James", (short)20, 12); // name, age, credits
                
                System.out.println(std1);
                
                Senior std2;
                
            try {
                std2 = new Senior("John", (short)30, 90); // name, age, credits
                
                System.out.println(std2);
            } catch (BadArgumentException ex) {
                Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
            }
		
		// ToDo 11: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
		
		
		// ToDo 12: add comments and explain your code
		
		// ToDo 13: submit using a pull request.
	}

}