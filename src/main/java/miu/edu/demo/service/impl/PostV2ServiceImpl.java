//package miu.edu.demo.service.impl;
//
//import miu.edu.demo.domain.Post;
//import miu.edu.demo.domain.PostV2;
//import miu.edu.demo.domain.dto.PostDto;
//import miu.edu.demo.helper.ListMapper;
//import miu.edu.demo.repo.PostRepo;
//import miu.edu.demo.repo.PostV2Repo;
//import miu.edu.demo.service.PostService;
//import miu.edu.demo.service.PostV2Service;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class PostV2ServiceImpl implements PostV2Service {
//
//    @Autowired
//    ModelMapper modelMapper;
//
////    @Autowired
////    ListMapper<Post, PostDto> listMapperPostToDto;
//
//    @Autowired
//    PostV2Repo postV2Repo;
//
//    @Override
//    public void save(PostV2 postV2) {
//
//        postV2Repo.save(postV2);
//    }
//
//    @Override
//    public void deletePostV2(int id) {
//        postV2Repo.deleteById(id);
//    }
//
//    @Override
//    public void updatePostV2(PostV2 postV2, int id) {
//
//    }
//
//    @Override
//    public PostV2 getById(int id) {
//        Optional<PostV2> postV2Optional = postV2Repo.findById(id);
//        PostV2 postV2 = null;
//        if (postV2Optional.isPresent()) {
//            postV2 = postV2Optional.get();
//        }
//
//
//        return postV2;
//
//    }
//
//
//
//}
