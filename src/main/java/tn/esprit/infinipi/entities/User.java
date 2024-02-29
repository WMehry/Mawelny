package tn.esprit.infinipi.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User implements Serializable  {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_user;
    private String user_firstname;
    private String user_lastname;
    private String email;
    private String user_password;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    private String profile_picture;
    private String user_phone;
    private String Fn_rapport;
    private String badge;
    private String Sector_activite;
    private Float amount;

    public User(String user_firstname, String user_lastname, String email, String user_password, Set<Role> roles) {
        this.user_firstname = user_firstname;
        this.user_lastname = user_lastname;
        this.email = email;
        this.user_password = user_password;
        this.roles = roles;
    }


/*
    public void setUser_password(String password) {
        this.user_password = new BCryptPasswordEncoder().encode(password);
    }

    @JsonIgnore
    @Transient
    private List<GrantedAuthority> authorities;
    @JsonIgnore
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities = Collections.singletonList(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getPassword() {
        return user_password;
    }


    @JsonIgnore
    @Override
    public String getUsername() {
        return email;
    }
    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @JsonIgnore
    @Override
    public boolean isEnabled() {
        return true;
    }
    */


}
