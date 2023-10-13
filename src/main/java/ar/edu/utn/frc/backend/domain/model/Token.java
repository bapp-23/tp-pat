package ar.edu.utn.frc.backend.domain.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "t_token")
public class Token {

    /**
     * Tiene token name,
     * value (GUID)
     * created (datetime)
     * last user at (datetime)
     * expires (datetime)
     */

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private String guid;
    private Date created;
    private Date lastUserAt;
    private Date exprires;
    private boolean active;

    public Token(long id, String name, String guid, Date created, Date lastUserAt, Date exprires, boolean active) {
        this.id = id;
        this.name = name;
        this.guid = guid;
        this.created = created;
        this.lastUserAt = lastUserAt;
        this.exprires = exprires;
        this.active = active;
    }

    public long id() {
        return id;
    }

    public Token setId(long id) {
        this.id = id;
        return this;
    }

    public String name() {
        return name;
    }

    public Token setName(String name) {
        this.name = name;
        return this;
    }

    public String guid() {
        return guid;
    }

    public Token setGuid(String guid) {
        this.guid = guid;
        return this;
    }

    public Date created() {
        return created;
    }

    public Token setCreated(Date created) {
        this.created = created;
        return this;
    }

    public Date lastUserAt() {
        return lastUserAt;
    }

    public Token setLastUserAt(Date lastUserAt) {
        this.lastUserAt = lastUserAt;
        return this;
    }

    public Date exprires() {
        return exprires;
    }

    public Token setExprires(Date exprires) {
        this.exprires = exprires;
        return this;
    }

    public boolean active() {
        return active;
    }

    public Token setActive(boolean active) {
        this.active = active;
        return this;
    }

    public Token(){}

}
