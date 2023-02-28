package com.mfdev.api.core.dto.user.mapper;

import com.mfdev.api.core.dto.user.CreateUserDto;
import com.mfdev.api.core.entity.user.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.mapstruct.factory.Mappers.getMapper;

@Mapper
public interface UserMapper {
    UserMapper userMapper = getMapper(UserMapper.class);

    @Mapping(target = "id", ignore = true)
    User userCreateDtoToUser(CreateUserDto dto);
}
