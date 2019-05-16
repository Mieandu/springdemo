package com.mieandu.controller;

import com.mieandu.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

/**
 * @author mandu
 * @version 1.0
 * @date 2019/5/16 10:17
 */
@Controller
@RequestMapping("api/test")
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private UserService userService;
    @RequestMapping(value = "first")
    @ResponseBody
    public String test(@RequestParam(value = "itemCodes",required = false) String itemCodes, String zxvf){
        //logger.info("参数：{}",itemCodes);
        String[] split = itemCodes.split("[,，\n]");
        logger.info("sffffff:{}", Arrays.asList(split));
        logger.info("参数:"  + userService.getAccount());
        return "测试通过";
    }

}
