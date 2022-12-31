package com.driver.service.impl;

import com.driver.Convertor.UserConvertor;
import com.driver.io.entity.UserEntity;
import com.driver.io.repository.UserRepository;
import com.driver.service.UserService;
import com.driver.shared.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;


    @Override
    public UserDto createUser(UserDto userDto) throws Exception {
        UserEntity userEntity= UserConvertor.convertDtoToUser(userDto);
        userRepository.save(userEntity);
    }

    @Override
    public UserDto getUser(String email) throws Exception {
        return null;
    }

    @Override
    public UserDto getUserByUserId(String userId) throws Exception {
        return null;
    }

    @Override
    public UserDto updateUser(String userId, UserDto user) throws Exception {
        return null;
    }

    @Override
    public void deleteUser(String userId){
        UserEntity userEntity=userRepository.findByUserId(userId);
        if(userEntity==null){
            //
        }
        userRepository.delete(userEntity);
    }
    @Override
    public List<UserDto> getUsers(){
        List<UserDto> list = new ArrayList<>();
        Iterable<UserEntity> iterableObjects = userRepository.findAll();
        for(UserEntity userEntity:iterableObjects){
            UserDto userDto=new UserDto();
            list.add(userDto);
            return list;
        }
    }

}