package com.weather.system.entity;
import com.baomidou.mybatisplus.annotation.*; import lombok.Data; import java.time.LocalDateTime;
@Data @TableName("oper_log") public class OperLog { @TableId(type=IdType.AUTO) private Long id; private String operator; private String action; private String target; private LocalDateTime operateTime; private String ip; }
