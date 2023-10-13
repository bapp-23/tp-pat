package ar.edu.utn.frc.backend.application.request;

import java.util.Date;

public class CreateTokenRequest {

    private String name;

    private Date expires;

    public CreateTokenRequest(String name, Date expires) {
        this.name = name;
        this.expires = expires;
    }

    public CreateTokenRequest() {
    }

    public String name() {
        return name;
    }

    public CreateTokenRequest setName(String name) {
        this.name = name;
        return this;
    }

    public Date expires() {
        return expires;
    }

    public CreateTokenRequest setExpires(Date expires) {
        this.expires = expires;
        return this;
    }
}
