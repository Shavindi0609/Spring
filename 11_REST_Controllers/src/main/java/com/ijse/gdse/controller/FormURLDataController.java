package com.ijse.gdse.controller;

import com.ijse.gdse.dto.UseDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("form")
public class FormURLDataController {

    @PostMapping("save")
    public String saveUser(@ModelAttribute UseDTO useDTO) { // encapsulated bean ekak athulata dagannawa
        System.out.println(useDTO);
        return "saveUser";
    }
}
