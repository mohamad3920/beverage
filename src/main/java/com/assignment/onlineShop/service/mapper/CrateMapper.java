package com.assignment.onlineShop.service.mapper;

import com.assignment.onlineShop.repository.entity.Crate;
import com.assignment.onlineShop.service.model.CrateDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CrateMapper {
    CrateMapper INSTANCE = Mappers.getMapper(CrateMapper.class);

    CrateDto toDto(Crate crate);

    Crate toEntity(CrateDto crateDto);
}
