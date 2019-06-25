package com.shiner.promotion.api.Controller;


import com.shiner.promotion.utils.aboutDate.DateTools;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/test")
public class TestController {

        @GetMapping("/date")
        public String getDate(){
            Date date = DateTools.getDate();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return "当前时间 " + simpleDateFormat.format(date);

        }


}
