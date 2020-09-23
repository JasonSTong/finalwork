package com.ha5fun.finalwork.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.ha5fun.finalwork.pojo.RpmsBuildPojo;
import com.ha5fun.finalwork.service.RpmsBuildService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author chen
 * @Company ha5fun.com
 * @Date 2020/9/21 9:09 下午
 */
@Controller
@RequestMapping("/build/")
public class RpmsBuildController {
    @Autowired
    private RpmsBuildService buildService;

    @RequestMapping(method = RequestMethod.GET , value = "selAllBuildings")
    public ResponseEntity<String> testSel(){
        List<RpmsBuildPojo> allBuilds = buildService.findAllBuilds();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data",allBuilds);

        return ResponseEntity.ok(jsonObject.toJSONString());
    }
    @RequestMapping(method = RequestMethod.GET ,value = "selById")
    public ResponseEntity<String> selById(@Param("id") int id){
        RpmsBuildPojo rpmsBuild = buildService.selById(id);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data",rpmsBuild);

        return ResponseEntity.ok(jsonObject.toJSONString());
    }
    @RequestMapping(method = RequestMethod.GET,value = "delById")
    @ResponseBody
    public int delById(@Param("buildId") int buildId ){
        System.out.println(buildId+"++++++++++++++++++++++++++++++++++++++++++");
        buildService.deleteBuilds(buildId);
        return  buildService.deleteBuilds(buildId);
    }
    @RequestMapping(method = RequestMethod.GET , value = "reDelBuild")
    public int reDelId(@Param("buildId")int buildId ){
        return buildService.reDelBuild(buildId);
    }



}
