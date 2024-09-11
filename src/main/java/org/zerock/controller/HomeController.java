package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String showHomePage(Model model) {
        // 필요한 모델 속성을 설정합니다.
        model.addAttribute("message", "Welcome to the Home Page!");

        // JSP 파일의 논리적 이름을 반환합니다.
        return "hello"; // /WEB-INF/views/error.jsp로 매핑됩니다.
    }
}