package miu.edu.demo.controller;

import miu.edu.demo.domain.Post;
import miu.edu.demo.domain.dto.PostDto;
import miu.edu.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/posts")
public class PostController {

    @Autowired
    PostService postService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<PostDto> getPost() {
        return postService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void savePost(@RequestBody Post post) {

        postService.save(post);
    }

//    @GetMapping(path = "/{id}")
//    public PostDto getPostById(@PathVariable("id") int id) {
//        return postService.getById(id);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable int id) {
        var post = postService.getById(id);
        return ResponseEntity.ok(post);
    }

    @DeleteMapping(path = "/{id}")
    public void deletePost(@PathVariable("id") int id) {
        postService.deletePost(id);
    }

    @PutMapping(path = "/{id}")
    public void updatePost(@RequestBody Post post, @PathVariable("id") int id) {
        postService.updatePost(post, id);
    }

    @GetMapping(path = "/author")
    public List<Post> getPostByAuthor(@RequestParam("filter") String author) {

        return postService.getByAuthor(author);
    }





}
