package miu.edu.demo.controller;

import miu.edu.demo.domain.Post;
import miu.edu.demo.domain.Userr;
import miu.edu.demo.domain.dto.PostDto;
import miu.edu.demo.domain.dto.UserDto;
import miu.edu.demo.service.PostService;
import miu.edu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/users")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    PostService postService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<UserDto> getUser() {
        return userService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void saveUser(@RequestBody Userr user) {

        userService.save(user);
    }

//    @GetMapping(path = "/{id}")
//    public UserDto getUserById(@PathVariable("id") int id) {
//        return userService.getById(id);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getById(@PathVariable int id) {
        var user = userService.getById(id);
        System.out.println("called");
        return ResponseEntity.ok(user);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
    }

    @PutMapping(path = "/{id}")
    public void updateUser(@RequestBody Userr user, @PathVariable("id") int id) {
        userService.updateUser(user, id);
    }

    @GetMapping("/{id}/posts")
    public ResponseEntity<List<PostDto>> gePostsByUserId(@PathVariable long id) {
        var user = userService.getPostsByUserId(id);
        return ResponseEntity.ok(user);
    }


    @GetMapping(path = "/filter/posts/{numberPosts}")
    public List<UserDto> findUsersByPostsGreaterThan(@PathVariable("numberPosts") String numberPosts) {
        return userService.findUsersByPostsGreaterThan(Integer.parseInt(numberPosts));
    }


    @GetMapping(path = "/filter/posts/greaterthanone")
    public List<UserDto> findUsersByPostsGreaterThanOne() {
        return userService.findUsersByPostsGreaterThan(1);
    }



}
