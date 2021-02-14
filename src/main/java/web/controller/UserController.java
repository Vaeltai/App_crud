package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.User;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping(value = "/users")
    public String printUsers(Model model) {
        List<User> user = new ArrayList<>();
        user.add(new User("Anna", "Petrova", 23));
        user.add(new User("Oleg", "Ivanov", 21));
        model.addAttribute("user", user);
        return "users";
    }



//
//    @RequestMapping(value = "/users", method = RequestMethod.GET)
//    public String getUsers(ModelMap model,
//                          @RequestParam(value = "name", required = false) String name,
//                          @RequestParam(value = "surname", required = false) String surname,
//                          @RequestParam(value = "age", required = false) int age){
//        model.addAttribute("users", "name: " + name + " " + surname);
//        return "users";
//    }

}
