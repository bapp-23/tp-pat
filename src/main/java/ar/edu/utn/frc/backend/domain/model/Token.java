package ar.edu.utn.frc.backend.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Token {
    /**
     * Tiene token name,
     * value (GUID)
     * created (datetime)
     * last user at (datetime)
     * expires (datetime)
     * active (bool)
     */

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private String guid;
    private Date create;
    private Date lastUserAt;
    private Date expires;
    private boolean active;

    public Token(long id, String name, String guid, Date create, Date lastUserAt, Date expires, boolean active) {
        this.id = id;
        this.name = name;
        this.guid = guid;
        this.create = create;
        this.lastUserAt = lastUserAt;
        this.expires = expires;
        this.active = active;
    }

    public Token() { }

    public String name() {
        return name;
    }

    public Token setName(String name) {
        this.name = name;
        return this;
    }

    public long id() {
        return id;
    }

    public Token setId(long id) {
        this.id = id;
        return this;
    }

    public String guid() {
        return guid;
    }

    public Token setGuid(String guid) {
        this.guid = guid;
        return this;
    }

    public Date create() {
        return create;
    }

    public Token setCreate(Date create) {
        this.create = create;
        return this;
    }

    public Date lastUserAt() {
        return lastUserAt;
    }

    public Token setLastUserAt(Date lastUserAt) {
        this.lastUserAt = lastUserAt;
        return this;
    }

    public Date expires() {
        return expires;
    }

    public Token setExpires(Date expires) {
        this.expires = expires;
        return this;
    }

    public boolean active() {
        return active;
    }

    public Token setActive(boolean active) {
        this.active = active;
        return this;
    }
}
