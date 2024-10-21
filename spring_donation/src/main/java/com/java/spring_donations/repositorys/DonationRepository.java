package com.java.spring_donations.repositorys;

import com.java.spring_donations.domain.Donation;
import com.java.spring_donations.domain.UserDonation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

// JPA
public interface DonationRepository extends PagingAndSortingRepository<Donation,Integer> {

	// Phân chia theo trang.
    Page<Donation> findAll(Pageable pageable);

    // in ra tất cả đợt quyên góp
    // findAll: tìm ra tất cả
    
    // hiển thị ra tất cả đợt quyên góp...
    List<Donation> findAll();

    // Tìm đợt quyên góp theo ID
    Donation findDonationsById(int id);

    // Xóa theo id.
    void deleteById(int id);
    
    // hibernate:
    // repository: mapper ( SELECT * FROM ... )
    
    // JPA
}
