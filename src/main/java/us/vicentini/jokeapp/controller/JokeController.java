package us.vicentini.jokeapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import us.vicentini.jokeapp.services.JokeService;

@Controller
@RequiredArgsConstructor
public class JokeController {

    private final JokeService jokeService;

    @RequestMapping("/")
    public String getJoke(Model model) {

        model.addAttribute("joke", jokeService.getRandomQuote());

        return "chucknorris";
    }
}
