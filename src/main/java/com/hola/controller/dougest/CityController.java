package com.hola.controller.dougest;

import com.hola.dao.dougest.CityDao;
import com.hola.entity.dougest.City;
import com.hola.httpClient.HttpAPIService;
import com.hola.service.dougest.CityService;
import com.sun.javafx.scene.traversal.Direction;

import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

/**
 * Created by Dougest on 2017/3/10 0010.
 */
@RestController
@RequestMapping(value = "/hola", method = RequestMethod.GET)
public class CityController {
    @Autowired
    private CityService cityService;
    @Autowired
    private CityDao dao;
    @Resource
    private HttpAPIService httpAPIService;
    
    @RequestMapping("/cityid")
    public String city(Integer id){
        return cityService.findCity(id);
    }
    //mapper
    @RequestMapping("/citysid")
    public City citys(Integer id){
    	City c= cityService.findCitys(id);
        return c;
    }
    //jpa
    @RequestMapping("/cityList")
    public List<City> cityList(Integer id){
    	
    	return cityService.queryCityList(id);
    }

    @RequestMapping("/httpclient")
    public String test() throws Exception {
        String str = httpAPIService.doGet("http://www.baidu.com");
        System.out.println(str);
        return "hello";
    }


}
