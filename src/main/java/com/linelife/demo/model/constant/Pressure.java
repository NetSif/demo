package com.linelife.demo.model.constant;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "pressure")
public class Pressure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonIgnore
    private Long id;
    @Column(name = "user_id")
    @JsonProperty(value = "user_id")
    private Long userId;
    @Column(name = "date_time")
    @JsonProperty(value = "date_time")
    private LocalDateTime dateTime;
    @Column(name = "systolic")
    private Integer systolic;
    @Column(name = "diastolic")
    private Integer diastolic;
}
