package com.rookie.web;

import com.rookie.MyException.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Rookie YU
 * @create 2021-04-19 18:39
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        System.out.println("-------index------");
        return "index";
    }
}
