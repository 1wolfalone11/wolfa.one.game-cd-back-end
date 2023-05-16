package com.wolfalone.gamecdbackend.mapper;

import com.wolfalone.gamecdbackend.dto.UserDTO;
import com.wolfalone.gamecdbackend.entity.Account;
import com.wolfalone.gamecdbackend.entity.Users;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "Spring")
public interface UserMapper {


    @Mapping(target = "id", source = "accounttttt.id")
    @Mapping(target = "email", source = "accounttttt.email")
    @Mapping(target = "phone", source = "user.phone")
    @Mapping(target = "address", source = "user.address")
    @Mapping(target = "name", source = "user.fullName")
    UserDTO toDTO(Users user, Account accounttttt);
}
