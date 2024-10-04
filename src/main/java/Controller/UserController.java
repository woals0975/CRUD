package Controller;


import Entity.User;
import Service.UserService;
import ch.qos.logback.core.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/signup")
    public String signupForm() {
        return "signup"; // signup.html로 이동
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute User user, Model model) {
        userService.registerUser(user);

        return "signup"; // 회원가입 후 다시 양식으로 리디렉션
    }

}
