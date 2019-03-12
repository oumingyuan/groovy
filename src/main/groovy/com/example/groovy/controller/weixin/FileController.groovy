package com.example.groovy.controller.weixin

import groovy.util.logging.Slf4j
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile
import javax.validation.constraints.NotNull
import org.apache.commons.io.FileUtils
import groovyx.net.http.HTTPBuilder


import groovyx.net.http.RESTClient
import groovyx.net.http.HttpResponseDecorator


import static groovyx.net.http.ContentType.*


import static groovyx.net.http.Method.*


@RestController
@CrossOrigin
@Slf4j
class FileController {

    /**
     * 把前端传来的数据上传到服务器
     *
     * @param file 页面传入的文件 MultipartFile
     * @return 服务器返回成功信息
     */
    @RequestMapping(value = "/multipartFile")
    def uploadFile(@NotNull MultipartFile file) throws IOException {

        String contentType = file.getContentType()
        log.info("#########  contentType:" + contentType)

        String fileNamePage = file.getOriginalFilename()
        String filePathServer = "D:\\file\\to\\"
        File fileServer = new File(filePathServer + fileNamePage)

//        FileUtils.writeByteArrayToFile(fileServer, file.getBytes());
        FileUtils.copyInputStreamToFile(file.getInputStream(), fileServer)

        return "upload file success"
    }

    /**
     * 把前端传来的数据上传到服务器
     *
     * @param file 页面传入的文件 MultipartFile
     * @return 服务器返回成功信息
     */
    @RequestMapping(value = "/multipartFile_byteArray")
    def uploadFile_byteArray(@NotNull byte[] file) {

        println(file)


        return "upload file success"

    }

}
