package org.adam9e96.cookiestudy;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieManager extends HttpServlet {

    // 쿠키 생성
    public void createCookie(HttpServletResponse response, String name, String value, int hours) {
        Cookie cookie = new Cookie(name, value);
        cookie.setPath("/");
        cookie.setMaxAge(hours * 60 * 60);
        response.addCookie(cookie);
    }

    // 쿠키 읽기
    public Cookie getCookie(HttpServletRequest request, String name) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(name)) {
                    return cookie;
                }
            }
        }
        return null;
    }

    // 쿠키 업데이트
    public void updateCookie(HttpServletResponse response, String name, String newValue, int hours) {
        Cookie cookie = new Cookie(name, newValue);
        cookie.setPath("/");
        cookie.setMaxAge(hours * 60 * 60);
        response.addCookie(cookie);
    }

    // 쿠키 삭제
    public void deleteCookie(HttpServletResponse response, String name) {
        Cookie cookie = new Cookie(name, "");
        cookie.setPath("/");
        cookie.setMaxAge(0); // 즉시 만료
        cookie.setHttpOnly(true);
        response.addCookie(cookie);
    }

//    // 사용 예제
//    public void doGet(HttpServletRequest request, HttpServletResponse response) {
//        // 쿠키 생성
//        createCookie(response, "userName1", "홍길동", 24);
//
//        // 쿠키 읽기
//        Cookie userCookie = getCookie(request, "userName");
//        if (userCookie != null) {
//            String userName = userCookie.getValue();
//            System.out.println("사용자 이름: " + userName);
//        }
//
//        // 쿠키 업데이트
//        updateCookie(response, "userName", "김철수", 24);
//
//        // 쿠키 삭제
//        deleteCookie(response, "userName");
//    }
}