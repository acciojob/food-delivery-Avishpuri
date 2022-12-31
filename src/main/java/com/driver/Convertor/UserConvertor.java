package com.driver.Convertor;

import com.driver.io.entity.UserEntity;
import com.driver.shared.dto.UserDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserConvertor {
  public static UserEntity convertDtoToUser(UserDto userDto){
      return UserEntity.builder().userId(userDto.getUserId()).firstName(userDto.getFirstName()).lastName(userDto.getLastName()).email(userDto.getEmail()).build();
  }
  public static UserDto convertUserToDto(UserEntity userEntity){
      return UserDto.builder().id(userEntity.getId()).userId(userEntity.getUserId()).firstName(userEntity.getFirstName()).lastName(userEntity.getLastName()).email(userEntity.getEmail()).build();
  }
}
