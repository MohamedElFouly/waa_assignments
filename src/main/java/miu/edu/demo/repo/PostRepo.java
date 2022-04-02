package miu.edu.demo.repo;

import miu.edu.demo.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends CrudRepository<Post, Integer> {

    List<Post> findAll();


    List<Post> findPostByAuthor(String author);

}
