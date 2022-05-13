package com.holidayDate.controller;


import com.holidayDate.dto.HolidayDto;
import com.holidayDate.service.HolidayService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/holiday")
public class HolidayController {

    @Autowired
    HolidayService holidayService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HolidayDto> create(@Valid @RequestBody HolidayDto holidayDto) {
        HolidayDto createHoliday = holidayService.create(holidayDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createHoliday);
    }
}
