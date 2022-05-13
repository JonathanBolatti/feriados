package com.holidayDate.mapper;

import com.holidayDate.dto.HolidayDto;
import com.holidayDate.entity.HolidayEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-13T17:23:59-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14.1 (BellSoft)"
)
@Component
public class HolidayMapperImpl implements HolidayMapper {

    @Override
    public HolidayDto holidayEntityToHolidayDto(HolidayEntity holidayEntity) {
        if ( holidayEntity == null ) {
            return null;
        }

        HolidayDto holidayDto = new HolidayDto();

        holidayDto.setId( holidayEntity.getId() );
        holidayDto.setDate( holidayEntity.getDate() );
        holidayDto.setTitle( holidayEntity.getTitle() );
        holidayDto.setExtra( holidayEntity.getExtra() );

        return holidayDto;
    }

    @Override
    public HolidayEntity holidayDtoToHolidayEntity(HolidayDto holidayDto) {
        if ( holidayDto == null ) {
            return null;
        }

        HolidayEntity holidayEntity = new HolidayEntity();

        holidayEntity.setId( holidayDto.getId() );
        holidayEntity.setDate( holidayDto.getDate() );
        holidayEntity.setTitle( holidayDto.getTitle() );
        holidayEntity.setExtra( holidayDto.getExtra() );

        return holidayEntity;
    }
}
