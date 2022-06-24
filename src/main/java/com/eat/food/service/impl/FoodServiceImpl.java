package com.eat.food.service.impl;

import com.eat.food.domain.Food;
import com.eat.food.mapper.FoodMapper;
import com.eat.food.service.FoodService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wlf
 * @since 2022-05-16
 */
@Service
public class FoodServiceImpl extends ServiceImpl<FoodMapper, Food> implements FoodService {

}
