package com.weather.system.entity;
import com.baomidou.mybatisplus.annotation.*; import lombok.Data; import java.time.LocalDateTime;
@Data @TableName("device_alert") public class DeviceAlert { @TableId(type=IdType.AUTO) private Long id; private Long deviceId; private String type; private String level; private String message; private String status; private LocalDateTime createdAt; private String acknowledgedBy; private LocalDateTime acknowledgedAt; }
