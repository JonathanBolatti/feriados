package com.holidayDate.dto;


import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HolidayDto {

    private String id;
    @NotNull(message = "field name cannot be null")
    @NotBlank(message = "the name field cannot be empty")
    private String date;
    @NotNull(message = "field name cannot be null")
    @NotBlank(message = "the name field cannot be empty")
    private String title;
    @NotNull(message = "field name cannot be null")
    @NotBlank(message = "the name field cannot be empty")
    private String extra;

}
