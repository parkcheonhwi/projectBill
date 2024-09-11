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
        // �ʿ��� �� �Ӽ��� �����մϴ�.
        model.addAttribute("message", "Welcome to the Home Page!");

        // JSP ������ ���� �̸��� ��ȯ�մϴ�.
        return "hello"; // /WEB-INF/views/error.jsp�� ���ε˴ϴ�.
    }
}