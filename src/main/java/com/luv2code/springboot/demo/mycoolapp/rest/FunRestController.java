package com.luv2code.springboot.demo.mycoolapp.rest;

        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;

        import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;


    @GetMapping("/")
    public String sayHello(){

        return "Hello World! Time on server is " + LocalDateTime.now();
    }

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: "+ coachName + "Team name: "+teamName;
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a jest 5k!";
    }
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Szczesliwy dizen";
    }
    @GetMapping("/fortunes")
    public String getDailyFortunes(){
        return "Szczesliwy dizen 2";
    }



}
