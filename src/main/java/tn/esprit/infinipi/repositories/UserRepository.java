package tn.esprit.infinipi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.infinipi.entities.User;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {


    Optional<User> findUserByEmail(String username);

}
