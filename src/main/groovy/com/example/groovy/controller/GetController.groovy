package com.example.groovy.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin
class GetController {

    /**
     * get request without param
     *
     * @return "hello world"
     */
    @RequestMapping("/get2")
    def get() {

        println("123")
        return "hello world"

    }


}
