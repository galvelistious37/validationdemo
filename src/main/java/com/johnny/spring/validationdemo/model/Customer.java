package com.johnny.spring.validationdemo.model;

import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    @Min(value=0, message="Must be greater than or equal 0")
    @Max(value=10, message="Must be less than or equal 10")
    private int freePasses;

    @NotNull(message="is required")
    @Size(min=1, message="is required")
    private String lastName = "";

    @Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
    private String postalCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
