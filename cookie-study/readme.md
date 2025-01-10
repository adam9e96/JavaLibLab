# Cookie Study 프로젝트

이 프로젝트는 Java Servlet을 사용하여 쿠키를 생성, 읽기, 업데이트 및 삭제하는 예제입니다.

- `src/main/java/org/adam9e96/cookiestudy/CookieManager.java`: 쿠키를 생성, 읽기, 업데이트 및 삭제하는 유틸리티 클래스입니다.
- `src/main/java/org/adam9e96/cookiestudy/CookieServlet.java`: 쿠키 관련 작업을 처리하는 서블릿입니다.
###  기능 테스트

웹 브라우저를 열고 다음 URL을 통해 각 기능을 테스트할 수 있습니다:

- 쿠키 생성: `http://localhost:8080/cookie/create`
- 쿠키 읽기: `http://localhost:8080/cookie/read`
- 쿠키 업데이트: `http://localhost:8080/cookie/update`
- 쿠키 삭제: `http://localhost:8080/cookie/delete`