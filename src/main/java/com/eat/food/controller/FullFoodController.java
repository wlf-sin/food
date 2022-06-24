package com.eat.food.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.eat.food.domain.FullFood;
import com.eat.food.service.FullFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wlf
 * @since 2022-05-16
 */
@RestController
@RequestMapping("/f-food")
public class FullFoodController {
    @Autowired
    private FullFoodService fullFoodService;

    @GetMapping(value = "/random")
    public String findById() {
        Random random = new Random(System.currentTimeMillis());
        QueryWrapper<FullFood> foodQueryWrapper = new QueryWrapper<>();
        int count = fullFoodService.count(foodQueryWrapper);
        int i = random.nextInt(count) + 1;
        FullFood byId = fullFoodService.getById(i);
        return byId.getName();
    }
}
