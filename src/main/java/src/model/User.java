package src.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer id;

    @NotNull
    @Column(name = "Login")
    private String login;

    @NotNull
    @Column(name = "Password")
    private String password;

    public User(String login, String password){
        this.login = login;
        this.password = password;
    }


    public void addGoodToCart(Integer id, String name, Integer price){
        Good good = new Good(id, name, price);
       // cart.add(good);
    }
    public User(){

    }


    public void addToCart(Good good){
      //  cart.add(good);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
