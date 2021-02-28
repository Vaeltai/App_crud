package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

@Controller
@RequestMapping(value = "/users")
public class UserController {
    UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping(value = "/new")
    public String newUser(Model model){
        model.addAttribute("user", new User());
        return "/new";
    }

    @PostMapping
    public String addUser(@ModelAttribute("user") User user){
        userService.addUser(user);
        return "redirect:/users";
    }

    @GetMapping()
    public String users(Model model){
        model.addAttribute("users", userService.getListUsers());
        return "/users";
    }

    public String createUser(@RequestParam("name") String name,
                             @RequestParam("surname") String surname,
                             @RequestParam("age") int age,
                             Model model){
        model.addAttribute("user", new User(name, surname, age));
        return "redirect:/users";
    }

    @GetMapping("/{id}")
    public String showUser (@PathVariable("id") int id, Model model){
        model.addAttribute("user", userService.show(id));
        return "/show";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id){
        model.addAttribute("user", userService.show(id));
        return "/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user") User user, @PathVariable("id") int id){
        userService.update(id, user);
        return "redirect:/users";
    }
}
