package com.holidayDate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Data
@Table(name = "feriados")
@SQLDelete(sql = "UPDATE news SET soft_delete = true WHERE id=?")
@Where(clause = "soft_delete=false")
public class HolidayEntity {

        @Id
        @GeneratedValue(generator = "uuid")
        @GenericGenerator(name = "uuid", strategy = "uuid2")
        private String id;

        @Column(nullable = false, length = 100)
        private String date;
        @Column(nullable = false, length = 100)
        private String title;
        @Column(nullable = false, length = 100)
        private String extra;

    }

