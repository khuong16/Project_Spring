package com.java.spring_donations.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

// khai báo đây là entity
@Entity
// table tương ứng trong sql là donation
@Table(name = "donation")
// trả ra data
@Data
// đều là constructor khi tương tác với lombook.
// Constructor sẽ tạo ra có đối số truyền vào tương ứng.
@AllArgsConstructor
// Constructor ko có tham số truyền vào.
@NoArgsConstructor

public class Donation {
    // id
                                                @Id
    // cột tương ứng trong sql là "id"
    @Column(name = "id")
    // có thuộc tính là tự tăng.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "code")
    private String code;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "organization_name")
    private String organizationName;

    @Column(name = "money")
    private int money;

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;

    @Column(name = "status")
    private int status;

    // có khóa ngoại
    @OneToMany(mappedBy = "donation")
    private List<UserDonation> userDonations;

    @Column(name = "created")
    private String createdAt;
}
