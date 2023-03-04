package ru.springmadigital.madigitalbot.botwork;

import org.springframework.security.crypto.password.PasswordEncoder;

import java.io.FileReader;
import java.io.IOException;

import static java.lang.String.valueOf;

public class PasswordKey {
    private CharSequence passwordkey ;

    public CharSequence getPasswordkey() {
        passwordkey = "";
        try (FileReader reader = new FileReader("notes2.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                passwordkey += valueOf((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return passwordkey;
    }

    public void setPasswordkey(String passwordkey) {
        this.passwordkey = passwordkey;
    }
}
