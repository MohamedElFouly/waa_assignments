package miu.edu.demo.service.impl;

import miu.edu.demo.domain.Post;
import miu.edu.demo.domain.dto.PostDto;
import miu.edu.demo.helper.ListMapper;
import miu.edu.demo.repo.PostRepo;
import miu.edu.demo.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    ListMapper<Post, PostDto> listMapperPostToDto;

    @Autowired
    PostRepo postRepo;

    @Override
    public void save(Post post) {

        postRepo.save(post);
    }

    @Override
    public void deletePost(int id) {
        postRepo.deleteById(id);
    }

    @Override
    public void updatePost(Post post, int id) {

    }

    @Override
    public List<Post> getByAuthor(String author) {
        return postRepo.findPostByAuthor(author);
    }

    @Override
    public PostDto getById(int id) {
        return modelMapper.map(postRepo.findById(id).get(), PostDto.class);
    }



    @Override
    public List<PostDto> findAll() {
        return (List<PostDto>)listMapperPostToDto.mapList(postRepo.findAll(),new PostDto());

    }


}
