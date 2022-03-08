/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {
	
	public static void main(String[] args) {
                
            // Create student 1
		Freshman student1 = new Freshman("James", (short)20, 12); // name, age, credits
                
                // Set the address of student 1
                student1.setAddress("1813 Merrick Rd");
                Scanner scnr = new Scanner(System.in);
                
                // Ask for a GPA for student 1
                System.out.println("Please enter a GPA for " + student1.getName());
                student1.setGPA(scnr.nextFloat());
                
                // Output student 1 info
                System.out.println("-------------------------------------------");
                System.out.println(student1.toString());
                System.out.println("-------------------------------------------");
                
            // Seniors must have atleast 85 credits, throw exception if 84 credits or less
            try {
                // Create student 2
                Senior student2 = new Senior("John", (short)30, 90); // name, age, credits
                
                // Set address of student 2
                student2.setAddress("1946 Wantagh Ave");
                
                // Ask for a GPA for student 2
                System.out.println("Please enter a GPA for " + student2.getName());
                student2.setGPA(scnr.nextFloat());
                
                // Output student 2 info
                System.out.println("-------------------------------------------");
                System.out.println(student2.toString());
                System.out.println("-------------------------------------------");
                
            } catch (BadArgumentException ex) {
                System.out.println(ex.getMessage());
            }
	}
}