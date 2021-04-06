package com.example.fcjava.contoller;

import com.example.fcjava.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // Localhost:8080/api
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "getMethod")
    public String getRequest() {

        return "Hi getMethod";
    }

    @GetMapping("/getParameter")
    public String getParameter(@RequestParam String id, @RequestParam String password) {
        System.out.println("ID : " + id);
        System.out.println("PASSWORD : " + password);

        return id + password;
    }

    @GetMapping("/getMultiParameter")
    public String getMultiParameter(SearchParam searchParam) {
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        return "OK";
    }
}
