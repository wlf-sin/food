package com.eat.food.mapper;

import com.eat.food.domain.Food;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wlf
 * @since 2022-05-16
 */
@Mapper
public interface FoodMapper extends BaseMapper<Food> {

}
