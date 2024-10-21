package com.java.spring_donations.repositorys;

import com.java.spring_donations.domain.Donation;
import com.java.spring_donations.domain.User;
import com.java.spring_donations.domain.UserDonation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// JPA
public interface UserDonationRepository extends JpaRepository<UserDonation,Integer> {
	
	// Lưu các cuộc quyên góp.
    UserDonation save(UserDonation userDonation);

    // Tìm ra người quyên góp trong cuộc quyên góp đó.
    List<UserDonation> findUserDonationByDonation(Donation donation);

    // Tìm ra người quyên góp đó bởi người dùng
    List<UserDonation> findUserDonationByUser(User user);

    // tìm ra người quyên góp bằng id.
    UserDonation findUserDonationById(int id);
}
