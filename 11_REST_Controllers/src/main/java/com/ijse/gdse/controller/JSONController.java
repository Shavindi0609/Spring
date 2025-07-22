package com.ijse.gdse.controller;

import com.ijse.gdse.dto.CityDTO;
import com.ijse.gdse.dto.UseDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("json")
public class JSONController {

//    @PostMapping(value = "save",consumes = MediaType.APPLICATION_JSON_VALUE)
//    public String save(@RequestBody UseDTO useDTO) {
//        System.out.println(useDTO);
//        return "saveUser";
//    }

    @PostMapping(value = "save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveUser(@RequestBody UseDTO useDTO) {
        System.out.println(useDTO);
        return "saveUser";
    }

    @GetMapping("/get")
    public UseDTO getUser() {
        UseDTO user = new UseDTO();
        user.setuId("U001");
        user.setuName("Kasun");
        user.setuAddress("Colombo");

       user.setuCity(new CityDTO("Panadura","12400")); //JSON object ekak athule thawath JSON object ekak
       return user;

       
    }
}