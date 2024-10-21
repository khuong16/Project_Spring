package com.java.spring_donations.utils;

import com.java.spring_donations.constants.CommonConstants;
import com.java.spring_donations.domain.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Objects;

// Middleware là những đoạn mã trung gian nằm giữa các request và response. 
// Nó nhận các request, thi hành các mệnh lệnh tương ứng trên request đó. 
// Sau khi hoàn thành nó response (trả về) hoặc chuyển kết quả ủy thác cho một Middleware khác trong hàng đợi.
public class Middleware {

	// xây dựng middleware public: xác minh xem có phải user hay ko.
    public  static boolean middleware( HttpServletRequest request){;
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute(CommonConstants.SESSION_USER);
        if (Objects.nonNull(user)) {
            return true;
        } else {
            return false;
        }
    }
    
    // xây dựng middleware admin: xác minh xem có phải admin hay ko.
    public  static boolean middlewareAdmin( HttpServletRequest request){;
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute(CommonConstants.SESSION_ADMIN);
        if (Objects.nonNull(user)) {
            return true;
        } else {
            return false;
        }
    }
}
