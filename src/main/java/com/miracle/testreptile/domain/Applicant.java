package com.miracle.testreptile.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Miracle
 * @date 2019/12/24 13:59
 */
@Data
@Entity
@Table(name = "applicant")
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer gender;

    private Integer age;

    private String phone;

    private String offer;

    private String profile;

    private String stationName;

    private LocalDateTime createTime;

    private LocalDate sysTime;

    private Integer source;
}
