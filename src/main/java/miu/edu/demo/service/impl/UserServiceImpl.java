package miu.edu.demo.service.impl;

import miu.edu.demo.domain.Post;
import miu.edu.demo.domain.Userr;
import miu.edu.demo.domain.dto.PostDto;
import miu.edu.demo.domain.dto.UserDto;
import miu.edu.demo.helper.ListMapper;
import miu.edu.demo.repo.UserRepo;
import miu.edu.demo.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    ListMapper<Userr, UserDto> listMapperUserToDto;

    @Autowired
    UserRepo userRepo;

    @Autowired
    ListMapper<Post, PostDto> listMapperPostToDto;

    @Override
    public void save(Userr user) {

        userRepo.save(user);
    }

    @Override
    public void deleteUser(long id) {
        userRepo.deleteById(id);
    }

    @Override
    public void updateUser(Userr user, long id) {

    }

//    @Override
//    public List<Userr> findUsersByPostsGreaterThan(int numberPosts) {
//        return userRepo.findUsersByPostsGreaterThan(numberPosts);
//    }

    @Override
    public UserDto getById(long id) {
        return modelMapper.map(userRepo.findById(id).get(), UserDto.class);
    }



    @Override
    public List<UserDto> findAll() {
        return (List<UserDto>)listMapperUserToDto.mapList(userRepo.findAll(),new UserDto());

    }

    @Override
    public List<PostDto> getPostsByUserId(long id) {
        return (List<PostDto>) listMapperPostToDto.mapList(userRepo.findById(id).get().getPosts(), new PostDto());
    }

    @Override
    public List<UserDto> findUsersByPostsGreaterThan(int numberPosts) {
        System.out.println("Got here");
        return (List<UserDto>) listMapperUserToDto.mapList(userRepo.findUsersByPostsGreaterThan(numberPosts), new UserDto());
    }


}
