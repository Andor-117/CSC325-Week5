
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Owen Wurster
 */
public class BadArgumentException extends Exception { 
    public BadArgumentException(String errorMessage) {
        super(errorMessage);
    }
}
