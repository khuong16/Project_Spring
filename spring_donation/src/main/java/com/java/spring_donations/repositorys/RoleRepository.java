package com.java.spring_donations.repositorys;

import com.java.spring_donations.domain.Role;
import com.java.spring_donations.domain.UserDonation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// JPA
public interface RoleRepository extends JpaRepository<Role,Integer> {
	
	// Tìm role theo id: VD: 0 là user, 1 là admin
    Role findRoleById(int id);

    // In ra tất cả các role.
    List<Role> findAll();
}
