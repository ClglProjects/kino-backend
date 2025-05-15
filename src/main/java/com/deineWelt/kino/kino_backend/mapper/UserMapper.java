package com.deineWelt.kino.kino_backend.mapper;

import com.deineWelt.kino.kino_backend.entity.User;
import com.deineWelt.kino.kino_backend.dto.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(UserDto dto);
}
