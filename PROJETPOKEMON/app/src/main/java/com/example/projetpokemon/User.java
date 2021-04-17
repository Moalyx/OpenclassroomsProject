package com.example.projetpokemon;

public class User {
    private String mEmail;
    private String mPassword;

    public String getEmail()
    {
        return mEmail;
    }

    public void setEmail(String email)
    {
        this.mEmail = email;
    }

    public String getPassword()
    {
        return mPassword;
    }

    public void setPassword(String password)
    {
        this.mPassword = password;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "mEmail='" + mEmail + '\'' +
                ", mPassword='" + mPassword + '\'' +
                '}';
    }
}
