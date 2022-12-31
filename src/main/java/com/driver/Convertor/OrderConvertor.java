package com.driver.Convertor;

import com.driver.io.entity.OrderEntity;
import com.driver.io.entity.UserEntity;
import com.driver.shared.dto.OrderDto;
import com.driver.shared.dto.UserDto;
import lombok.Builder;
import lombok.experimental.UtilityClass;

@UtilityClass
public class OrderConvertor {
    public static OrderEntity convertDtoToUser(OrderDto orderDto){
       return OrderEntity.builder().orderId(orderDto.getOrderId()).cost(orderDto.getCost()).items(orderDto.getItems()).userId(orderDto.getUserId()).status(orderDto.isStatus()).build();
    }
    public static OrderDto convertUserToDto(OrderEntity orderEntity){
      return OrderDto.builder().id(orderEntity.getId()).orderId(orderEntity.getOrderId()).cost(orderEntity.getCost()).items(orderEntity.getItems()).userId(orderEntity.getUserId()).status(orderEntity.isStatus()).build();
    }
}
