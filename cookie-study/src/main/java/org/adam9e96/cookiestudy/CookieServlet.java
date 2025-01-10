package org.adam9e96.cookiestudy;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cookie/*")
public class CookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String pathInfo = request.getPathInfo();
        CookieManager cookieManager = new CookieManager();

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");

        switch(pathInfo) {
            case "/create":
                // 쿠키 생성
                cookieManager.createCookie(response, "userName", "홍길동", 24);
                out.println("<h2>쿠키가 생성되었습니다.</h2>");
                out.println("<p>쿠키 이름: userName, 값: 홍길동</p>");
                break;

            case "/read":
                // 쿠키 읽기
                Cookie cookie = cookieManager.getCookie(request, "userName");
                if (cookie != null) {
                    out.println("<h2>쿠키 값:</h2>");
                    out.println("<p>" + cookie.getName() + ": " + cookie.getValue() + "</p>");
                } else {
                    out.println("<h2>쿠키가 없습니다.</h2>");
                }
                break;

            case "/update":
                // 쿠키 업데이트
                cookieManager.updateCookie(response, "userName", "김철수", 24);
                out.println("<h2>쿠키가 업데이트되었습니다.</h2>");
                out.println("<p>새로운 값: 김철수</p>");
                break;

            case "/delete":
                // 쿠키 삭제
                cookieManager.deleteCookie(response, "userName");
                out.println("<h2>쿠키가 삭제되었습니다.</h2>");
                break;

            default:
                out.println("<h2>사용 가능한 작업:</h2>");
                out.println("<ul>");
                out.println("<li><a href='/cookie/create'>쿠키 생성</a></li>");
                out.println("<li><a href='/cookie/read'>쿠키 읽기</a></li>");
                out.println("<li><a href='/cookie/update'>쿠키 업데이트</a></li>");
                out.println("<li><a href='/cookie/delete'>쿠키 삭제</a></li>");
                out.println("</ul>");
        }

        out.println("<br><a href='/cookie'>메인 메뉴로 돌아가기</a>");
        out.println("</body></html>");
    }
}