package tn.esprit.infinipi.services;



import tn.esprit.infinipi.entities.User;

import java.util.List;


public interface UserService {

    void addUser(User user);
    public void  saveUser(User user);
    public List<User> getAllUser();
    public void deleteUser(int id);
   public User updateUser(User user );
}
