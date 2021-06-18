package repository;

import java.util.List;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {

     User findByUserName(String userName);
     List<User> findByEmail(String email);


}
