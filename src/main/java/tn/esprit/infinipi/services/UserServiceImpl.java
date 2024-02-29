package tn.esprit.infinipi.services;


import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.infinipi.entities.Role;
import tn.esprit.infinipi.entities.RoleName;
import tn.esprit.infinipi.entities.User;
import tn.esprit.infinipi.repositories.UserRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public void addUser(User user) {
        repository.save(user);
    }


    @Override
    public User updateUser(User user) {


       return repository.save(user);
    }



    @Override
    @Transactional
    public void saveUser(User user) {


        Set<Role> roles = new HashSet<>();
        Role r = new Role();
        r.setId((1L) );
        r.setName(RoleName.ROLE_CUSTOMER);
        roles.add(r);
        user.setRoles(roles);
        repository.save(user);

    }

    @Override
    public List<User> getAllUser() {
        return (List<User>) repository.findAll();
    }

    @Override
    public void deleteUser(int id) {
        repository.deleteById(id);
    }
}
