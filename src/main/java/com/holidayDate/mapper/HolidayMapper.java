package com.holidayDate.mapper;

import com.holidayDate.dto.HolidayDto;
import com.holidayDate.entity.HolidayEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface HolidayMapper {

    HolidayMapper HOLIDAY_MAPPER = Mappers.getMapper(HolidayMapper.class);

    HolidayDto holidayEntityToHolidayDto(HolidayEntity holidayEntity);
    HolidayEntity holidayDtoToHolidayEntity(HolidayDto holidayDto);

}
