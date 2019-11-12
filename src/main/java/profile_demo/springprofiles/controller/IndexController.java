package profile_demo.springprofiles.controller;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import profile_demo.springprofiles.domain.GitHubUser;

@Controller
public class IndexController {

    private RestTemplate template;

    public IndexController(RestTemplate template) {
        this.template = template;
    }

    @GetMapping("/")
    public String index(@RequestParam(name = "username", defaultValue = "atinsingh") String username, Model model){
        System.out.println("******** GOT HERE *** with PARAM "+ username);
        GitHubUser user = template.getForObject("https://api.github.com/users/{username}",
                GitHubUser.class,
                new Object[]{username});
        model.addAttribute("user", user);
        return "index";
    }
}
