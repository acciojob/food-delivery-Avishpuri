package com.driver.Convertor;

import com.driver.io.entity.FoodEntity;
import com.driver.io.entity.UserEntity;
import com.driver.shared.dto.FoodDto;
import com.driver.shared.dto.UserDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class FoodServiceConvertor {
    public static FoodEntity convertDtoToUser(FoodDto foodDto){
       return FoodEntity.builder().foodId(foodDto.getFoodName()).foodName(foodDto.getFoodName()).foodPrice(foodDto.getFoodPrice()).foodCategory(foodDto.getFoodCategory()).build();
    }
    public static FoodDto convertUserToDto(FoodEntity foodEntity){
       return FoodDto.builder().id(foodEntity.getId()).foodId(foodEntity.getFoodId()).foodName(foodEntity.getFoodName()).foodPrice(foodEntity.getFoodPrice()).foodCategory(foodEntity.getFoodCategory()).build();
    }
}
