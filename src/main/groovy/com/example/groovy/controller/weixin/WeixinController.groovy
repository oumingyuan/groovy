package com.example.groovy.controller.weixin

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import javax.servlet.http.HttpServletResponse

/**
 * 微信小程序开发的控制层
 */
@RestController
@CrossOrigin
//跨域注解
class WeixinController {

    //buttonTest2

    /**
     * get request without param
     *
     * @return "hello world"
     */

    /**
     * 随便写着玩的
     * @param username 这个参数是有用的
     * @param password
     * @return
     */
    @RequestMapping("/buttonTest1")
    def get(String username, String password) {

        println("username=" + username + " ,password=" + password)
        return "hello " + username

    }


    /**
     * 网上当的，最原始的写法，没有使用框架
     * @param username
     * @param password
     * @param response
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/buttonTest2")
    def buttonTest(String username, String password, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8")
        /* 设置响应头允许ajax跨域访问 */
        response.setHeader("Access-Control-Allow-Origin", "*")
        /* 星号表示所有的异域请求都可以接受， */
        response.setHeader("Access-Control-Allow-Methods", "GET,POST")

        println("username=" + username + " ,password=" + password)

        //返回值给微信小程序
        Writer out = response.getWriter()
        out.write("进入后台")
        out.flush()
    }


}
