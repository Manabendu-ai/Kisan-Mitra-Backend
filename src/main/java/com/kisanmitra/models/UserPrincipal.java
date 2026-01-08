//package com.kisanmitra.models;
//
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//import org.jspecify.annotations.Nullable;
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.security.core.GrantedAuthority;
////import org.springframework.security.core.authority.SimpleGrantedAuthority;
////import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Component;
//
//import java.util.Collection;
//import java.util.List;
//
//@Component
//@NoArgsConstructor
//@AllArgsConstructor
//public class UserPrincipal implements UserDetails {
//
//    @Autowired
//    private User user;
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return List.of(new SimpleGrantedAuthority(user.getRole()));
//    }
//
//    @Override
//    public @Nullable String getPassword() {
//        return String.valueOf(user.getPassword());
//    }
//
//    @Override
//    public String getUsername() {
//        return String.valueOf(user.getUserId());
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
