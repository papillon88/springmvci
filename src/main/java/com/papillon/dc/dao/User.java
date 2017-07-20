package com.papillon.dc.dao;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by papillon on 7/13/2017.
 */
public class User {

    @NotBlank(message = "cannot be blank")
    @Size(min = 8,max = 15,message = "size should be between 8 to 15 chars")
    @Pattern(regexp = "^\\w{8,}$", message = "only numbers,letters or underscore chars")
    private String username;

    @Email(message = "not a valid email")
    @NotEmpty(message = "email cannot be empty")
    private String email;

    @NotBlank
    @Pattern(regexp = "^\\S+$" , message = "no spaces")
    @Size(min = 8, max = 15, message = "passwrd between 8 and 15 chars only")
    private String password;

    private boolean enabled;
    private String authority;


    public User(){}

    public User(String username, String password, boolean enabled, String authority, String email) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.authority = authority;
        this.email = email;
    }

    public User(String username, String password, boolean enabled, String authority) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.authority = authority;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (enabled != user.enabled) return false;
        if (!username.equals(user.username)) return false;
        if (!email.equals(user.email)) return false;
        return authority.equals(user.authority);
    }

    @Override
    public int hashCode() {
        int result = username.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + (enabled ? 1 : 0);
        result = 31 * result + authority.hashCode();
        return result;
    }
}
