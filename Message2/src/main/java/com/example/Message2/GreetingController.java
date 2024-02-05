package com.example.Message2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Map<String,Object> model) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String main(Map<String,Object> model) {

        return "main";
    }

    @PostMapping
    public String send(@RequestParam String text, @RequestParam String tag, Map <String,Object> model) {
        model.put("text_message",text);
        model.put("tag_message",tag);
        return "massage";
    }

}