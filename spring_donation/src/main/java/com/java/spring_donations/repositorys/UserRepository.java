package com.java.spring_donations.repositorys;

import com.java.spring_donations.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

// JPA
public interface UserRepository extends JpaRepository<User,Integer> {
	
	// in ra tất cả các user
    List<User> findAll();

    // tìm user theo Email
    User findUserByEmail(String email);

    // tìm user theo email và password
    // Select * from ... where email = ? and pass = ?
    User findUserByEmailAndPassword(String email,String password);

    // xử lý chức năng đăng nhập và in ra thông tin của admin
    @Query(value = "SELECT * from  user  WHERE email = ? and password = ? and role_id != 1 ",nativeQuery = true)
    User checkLoginAdmin(String email,String password);

    // tìm user theo id
    User findUserById(int id);

    // tìm user theo user name
    User findUserByUserName(String userName);

    // xóa theo id.
    void deleteById(int id);
    

}
