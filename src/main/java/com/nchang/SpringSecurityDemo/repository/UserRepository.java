package com.nchang.SpringSecurityDemo.repository;

import com.nchang.SpringSecurityDemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findUserByUserName(String name);
    public User findUserByEmail(String email);
}
