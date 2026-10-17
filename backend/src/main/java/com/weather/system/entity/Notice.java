package com.weather.system.entity;
import com.baomidou.mybatisplus.annotation.*; import lombok.Data; import java.time.LocalDateTime;
@Data @TableName("notice") public class Notice { @TableId(type=IdType.AUTO) private Long id; private String title; private String content; private String publisher; private LocalDateTime publishTime; }
