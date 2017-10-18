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

   // private Set<GoodsEntity> contactTelDetails = new HashSet<GoodsEntity>();
//
   // @OneToMany(mappedBy = "use", cascade = CascadeType.ALL, orphanRemoval = true)
   // public Set<GoodsEntity> getContactTelDetails() {
   //     return this.contactTelDetails;
   // }

   // private String cart;

    //private List<Good> cart;

    public User(String login, String password){
        this.login = login;
        this.password = password;
       // this.cart = new ArrayList<>();
    }


    public void addGoodToCart(Integer id, String name, Integer price){
        Good good = new Good(id, name, price);
       // cart.add(good);
    }

    //  public User(String login, String password, List<Good> cart) {
//      this.login = login;
//      this.password = password;
//      this.cart = cart;
//  }
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


  // public List<Good> getCart() {
  //     return cart;
  // }

  // public void setCart(List<Good> cart) {
  //     this.cart = cart;
  // }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   //public boolean buyGoodById(Integer id) {
   //    for (int i = 0; i < cart.size() ; i++) {
   //        if(cart.get(i).getId() == id){
   //            System.out.println("Buying");
   //            cart.remove(i);
   //            return true;
   //        }
   //    }
   //    return false;
   //}

   //public Good findById(Integer id){
   //    Good good = null;
   //    for (int i = 0; i < cart.size() ; i++) {
   //        if(cart.get(i).getId() == id){
   //            good = cart.get(i);
   //        }
   //    }
   //    return good;
   //}

   //public boolean deleteGoodById(Integer id) {
   //    for (int i = 0; i < cart.size() ; i++) {
   //        if(cart.get(i).getId() == id){
   //            cart.remove(i);
   //            return true;
   //        }
   //    }
   //    return false;
   //}
}
