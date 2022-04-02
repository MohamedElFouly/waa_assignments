package miu.edu.demo.service;


import miu.edu.demo.domain.Userr;
import miu.edu.demo.domain.dto.PostDto;
import miu.edu.demo.domain.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> findAll();

    UserDto getById(long id);

    void save(Userr user);

    void deleteUser(long id);

    void updateUser(Userr user, long id);

    List<PostDto> getPostsByUserId(long id);

    List<UserDto> findUsersByPostsGreaterThan(int numberPosts);

}
