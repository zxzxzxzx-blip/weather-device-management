package com.weather.system.entity;
import com.baomidou.mybatisplus.annotation.*; import lombok.Data; import java.math.BigDecimal; import java.time.LocalDateTime;
@Data @TableName("maintain") public class Maintain { @TableId(type=IdType.AUTO) private Long id; private Long deviceId; private String faultDescription; private String maintainer; private String content; private LocalDateTime reportTime; private LocalDateTime finishTime; private BigDecimal cost; private String result; }
