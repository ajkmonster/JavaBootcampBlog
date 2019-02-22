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
    @GetMapping ("/programDesignAlg")
    public String getProgramDesignAlg(){
        return "programDesignAlg";
    }
    @GetMapping ("/initialGitHubPost")
    public String getInitialGitHubPost(){
        return "initialGitHubPost";
    }
    @GetMapping ("/gitHubPost2")
    public String getGitHubPost2(){
        return "gitHubPost2";
    }
    @GetMapping ("/pDA")
    public String getPDA(){return "pDA";}
    @GetMapping ("/pDA2")
    public String getPDA2(){return "pDA2";}
    @GetMapping ("/oop1")
    public String getOOP1(){
        return "oop1";
    }
    @GetMapping ("/oop2")
    public String getOOP2(){
        return "oop2";
    }
    @GetMapping ("/coreJava1")
    public String getCoreJava1(){
        return "coreJava1";
    }
    @GetMapping ("/coreJava2")
    public String getCoreJava2(){
        return "coreJava2";
    }
    @GetMapping ("/htmlCssBoot")
    public String getHtmlCssBoot(){
        return "htmlCssBoot";
    }
    @GetMapping ("/htmlCssBoot1")
    public String getHtmlCssBoot1(){
        return "htmlCssBoot1";
    }
    @GetMapping ("/htmlCssBoot2")
    public String getHtmlCssBoot2(){
        return "htmlCssBoot2";
    }
}

