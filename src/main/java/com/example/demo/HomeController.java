package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping ("/")
    public String getIndex(){
        return "index";
    }

    @GetMapping ("/home")
    public String getHome(){
        return "index";
    }

    @GetMapping ("/aboutus")
    public String getAboutUs(){
        return "aboutUs";
    }
    @GetMapping ("/coreJava")
    public String getCoreJava(){
        return "coreJava";
    }
    @GetMapping ("/gitHub")
    public String getGitHib(){
        return "github";
    }
    @GetMapping ("/javaBootcamp")
    public String getJavaBootcamp(){
        return "javaBootcamp";
    }
    @GetMapping ("/mission")
    public String getMission(){
        return "mission";
    }
    @GetMapping ("/oop")
    public String getOOP(){
        return "oop";
    }
    @GetMapping ("programDesignAlg")
    public String getProgramDesignAlg(){
        return "programDesignAlg";
    }

}

