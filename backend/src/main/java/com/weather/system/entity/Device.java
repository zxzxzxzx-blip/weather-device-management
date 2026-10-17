package com.weather.system.entity;
import com.baomidou.mybatisplus.annotation.*; import lombok.Data; import java.time.LocalDate;
@Data @TableName("device") public class Device { @TableId(type=IdType.AUTO) private Long id; private String code; private String name; private String type; private String model; private String manufacturer; private Long stationId; private LocalDate purchaseDate; private String status; private String remark; }
