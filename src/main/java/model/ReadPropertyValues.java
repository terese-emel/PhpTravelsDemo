package model;

import java.io.IOException;
import java.util.ResourceBundle;

public class ReadPropertyValues {
    private static ResourceBundle rb = ResourceBundle.getBundle("config");

    public ResourceBundle getPropValues() throws IOException {

        String emailText = rb.getString("email");
        String passwordText = rb.getString("password");
    return rb;
    }
}