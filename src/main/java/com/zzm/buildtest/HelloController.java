package com.zzm.buildtest;

import com.zzm.deptest.DependencyTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return new DependencyTest().test();
    }
}
