package Webpagename.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // @Controller : 컨트롤 어노테이션 [MVC 중에 C에 해당하는 클래스 데이터 주입 ]
public class Index {


    // @WebServlet("/") 과 유사 <-------> @GetMapping("/")
    @GetMapping("/")        // @GetMapping : URL 맵핑 어노테이션 [클라이언트가 요청한 URL 과 연결]
    public String index(Model model) { // main 문자열 반환하는 메소드  // 해당 메소드는 URL과 맵핑되면 실행되는 메소드
        //view 에 보내고자 하는 데이터 설정
        model.addAttribute("data","java데이터");
            // model.addAttribute("모델명",데이터);

        return "main"; // html 파일명 // 타임리프 사용할 경우의
        // 클라이언트가 localhost:808X 요청 시 Springboot controller 내에서 맵핑 URL 찾기
        // 찾은 매핑된 메소드 실행되면서 html 파일명 반환
    }

    // Http 요청 메소드 : Get vs Post
        // GetMapping("/")
        // PostMapping("/")
    @GetMapping("/getdata")
    @ResponseBody // @ResponseBody : 응답 객체
    public String getdata(){
        return "java데이터";

        // @ResponseBody 가 없을 경우 html 반환
        // @ResponseBody 가 있을 경우 java 객체 반환

    }




}
