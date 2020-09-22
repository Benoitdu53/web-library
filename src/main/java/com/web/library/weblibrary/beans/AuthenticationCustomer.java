package com.web.library.weblibrary.beans;

public class AuthenticationCustomer {

    private String email;
    private String password;

    @Override
    public String toString() {
        return "AuthenticationCustomer{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }
}
