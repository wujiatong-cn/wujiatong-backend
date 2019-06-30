package cn.wujiatong.backend.module.jinan.controller;

import cn.wujiatong.backend.module.jinan.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jinan")
@SuppressWarnings("unused")
public class CityController {
    @Autowired
    ICityService iCityService;

    @ResponseBody
    @RequestMapping(value = "show", method = RequestMethod.GET)
    public ResponseEntity test(){
        return new ResponseEntity(iCityService.list(), HttpStatus.OK);
    }
}
