package src.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import src.model.User;
import src.model.UsersDAO;

import java.util.List;

@RestController
public class UsersController {


    @RequestMapping(value = "/registr", method = RequestMethod.POST)
    public String registr(String login, String password){
        User user = null;
        try {
            user = new User(login, password);
            usersDAO.save(user);
        }
        catch (Exception ex) {
            return "Error registration user: " + ex.toString();
        }
        return "User succesfully registrateded! (login = " + user.getLogin() + ")";
    }

    @RequestMapping(value = "/delete_user", method = RequestMethod.GET)
    public String registr(Integer id){
        usersDAO.delete(usersDAO.findById(id));
        return usersDAO.toString();
    }
     @RequestMapping(value = "/get_all_users", method = RequestMethod.POST)
     public List<User> getAllUsers(){
         List<User> users = (List<User>) usersDAO.findAll();
         return  users;
     }

     @RequestMapping(value = "/get_all_users_string", method = RequestMethod.POST)
     public String getAllUsersString(User newUser){
         System.out.println(newUser.getLogin());
         List<User> users = (List<User>) usersDAO.findAll();
         String s = "";
         for (User user:
              users) {
             s += user.getId() + "&" + user.getLogin() + "&" + user.getPassword() + "-";
         }
         return s;
     }

    @Autowired
    private UsersDAO usersDAO;

}
