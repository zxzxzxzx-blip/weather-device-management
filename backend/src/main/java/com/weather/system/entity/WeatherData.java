package com.weather.system.entity;
import com.baomidou.mybatisplus.annotation.*; import lombok.Data; import java.math.BigDecimal; import java.time.LocalDateTime;
@Data @TableName("weather_data") public class WeatherData { @TableId(type=IdType.AUTO) private Long id; private Long deviceId; private LocalDateTime collectTime; private BigDecimal temperature; private BigDecimal humidity; private BigDecimal windSpeed; private BigDecimal rainfall; private BigDecimal pressure; }
