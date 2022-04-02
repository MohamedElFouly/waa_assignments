//package miu.edu.demo.service.impl;
//
//import lombok.extern.java.Log;
//import miu.edu.demo.domain.Logger;
//import miu.edu.demo.domain.Logger;
//import miu.edu.demo.repo.LoggerRepo;
//import miu.edu.demo.repo.LoggerRepo;
//import miu.edu.demo.service.LoggerService;
//import miu.edu.demo.service.LoggerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class LoggerServiceImpl implements LoggerService {
//
//
//    @Autowired
//    LoggerRepo loggerRepo;
//
//    @Override
//    public void save(Logger logger) {
//
//        loggerRepo.save(logger);
//    }
//
//    @Override
//    public void deleteLogger(long id) {
//        loggerRepo.deleteById(id);
//    }
//
//    @Override
//    public void updateLogger(Logger logger, long id) {
//
//    }
//
//
//    @Override
//    public Logger getById(long id) {
//        Optional<Logger> loggerOptional = loggerRepo.findById(id);
//        Logger logger = null;
//        if (loggerOptional.isPresent()) {
//            logger = loggerOptional.get();
//        }
//
//        return logger;
//
//    }
//
//
//
//    @Override
//    public List<Logger> findAll() {
//        return loggerRepo.findAll();
//
//    }
//
//
//}
