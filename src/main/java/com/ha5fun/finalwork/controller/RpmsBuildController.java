package com.ha5fun.finalwork.controller;

import com.alibaba.fastjson.JSONObject;
import com.ha5fun.finalwork.pojo.RpmsBuildPojo;
import com.ha5fun.finalwork.service.RpmsBuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.text.html.parser.Entity;
import java.util.List;

/**
 * @author chen
 * @Company ha5fun.com
 * @Date 2020/9/21 9:09 下午
 */
@Controller
public class RpmsBuildController {
    @Autowired
    private RpmsBuildService buildService;

    @RequestMapping("test")
    public ResponseEntity<String> testSel(){
        List<RpmsBuildPojo> allBuilds = buildService.findAllBuilds();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data",allBuilds);

        return ResponseEntity.ok(jsonObject.toJSONString());
    }

}
