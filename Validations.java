/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Vinee
 */
public class Validations {
    private Pattern email;
    private Pattern name;
    private Pattern password;
    private Matcher matcher;
    private static final String NAME_PATTERN="^[A-Za-z ]{3,25}$";
    private static final String PASS_PATTERN="^[A-Za-z0-9]{5,25}$";
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,3})$";
    public Validations() {
        email = Pattern.compile(EMAIL_PATTERN);
        name = Pattern.compile(NAME_PATTERN);
        password = Pattern.compile(PASS_PATTERN);
    }
    
    public boolean passwordValidate(final String pass1) {

        matcher = password.matcher(pass1);
        return matcher.matches();

    }

    public boolean emailValidate(final String email1) {

        matcher = email.matcher(email1);
        return matcher.matches();

    }
    
    public boolean nameValidate(final String name1) {

        matcher = name.matcher(name1);
        return matcher.matches();

    }
}

    

