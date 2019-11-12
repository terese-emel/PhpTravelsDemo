package model;

import java.util.ResourceBundle;

public class ReadPropertyValues {
    private static ResourceBundle rb = ResourceBundle.getBundle("config");

    public ResourceBundle getPropValues() {

        String emailText = rb.getString("email");
        String passwordText = rb.getString("password");
        return rb;
    }
}