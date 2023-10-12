package ar.edu.utn.frc.backend.infrastructure.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "token")
@Table(name = "t-token")
public class TokenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @Column(name = "name", length = 255, nullable = false, unique = true)
    private String tokenName;

    @Column(name = "value", nullable = false)
    private String value;

    @Column(name = "last_user_at")
    private Date lastUserAt;

    @Column(name = "expires", nullable = false)
    private Date expires;

    @Column(name = "created", nullable = false)
    private Date created;

    @Column(name = "active", nullable = false)
    private boolean active;

    public TokenEntity(){}

}
