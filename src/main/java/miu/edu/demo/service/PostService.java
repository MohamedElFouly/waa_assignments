package miu.edu.demo.service;

import miu.edu.demo.domain.Post;
import miu.edu.demo.domain.dto.PostDto;

import java.util.List;

public interface PostService {


    List<PostDto> findAll();

    PostDto getById(int id);

    void save(Post post);

    void deletePost(int id);

    void updatePost(Post post, int id);

    List<Post> getByAuthor(String author);
}
