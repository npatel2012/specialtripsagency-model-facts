package org.specialtripsagency;

import java.io.Serializable;

public class Rejection implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String reason;

    public Rejection() {
    }

    public Rejection(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }	
}
