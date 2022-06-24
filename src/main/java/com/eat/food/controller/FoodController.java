package com.eat.food.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.eat.food.domain.Food;
import com.eat.food.service.FoodService;
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
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @GetMapping("/random")
    public String findById() {
        Random random = new Random(System.currentTimeMillis());
        QueryWrapper<Food> foodQueryWrapper = new QueryWrapper<>();
        int count = foodService.count(foodQueryWrapper);
        int i = random.nextInt(count) + 1;
        Food byId = foodService.getById(i);
        return byId.getName();
    }
}
