//package com.kisanmitra.service.impl;
//
//import com.kisanmitra.models.User;
//import com.kisanmitra.models.UserPrincipal;
//import com.kisanmitra.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserDS implements UserDetailsService {
//
//    @Autowired
//    private UserRepository repo;
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user;
//        try{
//            user = repo.findUserByUserId(Integer.parseInt(username));
//            if(user==null){
//                System.out.println("USER Not Found!");
//                throw new UsernameNotFoundException("User 404");
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        return new UserPrincipal(user);
//    }
//}
