package controller;

/*
import dao.UserDaoImpl;
import model.User;

 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.UserService;
import service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
/*
    private UserDaoImpl user = new UserDaoImpl();

    @RequestMapping(value = "/", method = RequestMethod.GET)

    public String say(){
        return "users";
    }

    public String getUsers(Model model,
                          @RequestParam(value = "name", required = false) String name,
                          @RequestParam(value = "surname", required = false) String surname) {
        model.addAttribute("users", "name: " + name + " " + surname);
        return "users";
    }
*/



    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "users";
    }



}
