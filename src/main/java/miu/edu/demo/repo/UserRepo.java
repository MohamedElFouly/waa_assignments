package miu.edu.demo.repo;

import miu.edu.demo.domain.Post;
import miu.edu.demo.domain.Userr;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<Userr, Long> {


    List<Userr> findAll();


    @Query("select u from Userr u where u.posts > ?1")
    List<Userr> findUsersByPostsGreaterThan(int numberPosts);

}
