package com.cybage.model;

import org.springframework.stereotype.Component;

@Component
public class AuthOtp {
    private int otp;
    private boolean authorize;


    public AuthOtp() {
        super();
        // TODO Auto-generated constructor stub
    }
    public AuthOtp(int otp, boolean authorize) {
        super();
        this.otp = otp;
        this.authorize = authorize;
    }
    public int getOtp() {
        return otp;
    }
    public void setOtp(int otp) {
        this.otp = otp;
    }
    public boolean isAuthorize() {
        return authorize;
    }
    public void setAuthorize(boolean authorize) {
        this.authorize = authorize;
    }
    @Override
    public String toString() {
        return "AuthOtp [otp=" + otp + ", authorize=" + authorize + "]";
    }



}
