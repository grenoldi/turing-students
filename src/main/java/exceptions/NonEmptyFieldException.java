package exceptions;

import javax.swing.*;

public class NonEmptyFieldException extends Exception{
    public  NonEmptyFieldException(String message){
        super(message);
    }
}
