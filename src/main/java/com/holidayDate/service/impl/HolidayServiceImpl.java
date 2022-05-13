package com.holidayDate.service.impl;

import com.holidayDate.dto.HolidayDto;
import com.holidayDate.entity.HolidayEntity;
import com.holidayDate.mapper.HolidayMapper;
import com.holidayDate.repository.HolidayRepository;
import com.holidayDate.service.HolidayService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class HolidayServiceImpl implements HolidayService {

    @Autowired
    HolidayMapper holidayMapper;

    @Autowired
    HolidayRepository holidayRepository;

    @Override
    public HolidayDto create(HolidayDto holidayDto) {
        HolidayEntity entity =  holidayMapper.holidayDtoToHolidayEntity(holidayDto);
        HolidayEntity holidaySaved = holidayRepository.save(entity);
        HolidayDto result = holidayMapper.holidayEntityToHolidayDto(holidaySaved);
        return result;
    }
}
