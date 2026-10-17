package com.weather.system.entity;
import com.baomidou.mybatisplus.annotation.*; import lombok.Data; import java.time.LocalDate; import java.time.LocalDateTime;
@Data @TableName("maintain_plan") public class MaintainPlan { @TableId(type=IdType.AUTO) private Long id; private Long deviceId; private String title; private Integer cycleDays; private LocalDate nextDate; private String owner; private String status; private String remark; private LocalDateTime createTime; }
