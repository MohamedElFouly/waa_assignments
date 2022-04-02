//package miu.edu.demo.service.impl;
//
//import miu.edu.demo.domain.Comment;
//import miu.edu.demo.repo.CommentRepo;
//import miu.edu.demo.service.CommentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class CommentServiceImpl implements CommentService {
//
//
//    @Autowired
//    CommentRepo commentRepo;
//
//    @Override
//    public void save(Comment comment) {
//
//        commentRepo.save(comment);
//    }
//
//    @Override
//    public void deleteComment(long id) {
//        commentRepo.deleteById(id);
//    }
//
//    @Override
//    public void updateComment(Comment comment, long id) {
//
//    }
//
//
//    @Override
//    public Comment getById(long id) {
//        Optional<Comment> commentOptional = commentRepo.findById(id);
//        Comment comment = null;
//        if (commentOptional.isPresent()) {
//            comment = commentOptional.get();
//        }
//
//        return comment;
//
//    }
//
//
//
//    @Override
//    public List<Comment> findAll() {
//        return commentRepo.findAll();
//
//    }
//
//
//}
