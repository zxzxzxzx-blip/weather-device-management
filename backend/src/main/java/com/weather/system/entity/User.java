package com.weather.system.entity;
import com.baomidou.mybatisplus.annotation.*; import lombok.Data; import java.time.LocalDateTime;
@Data @TableName("sys_user") public class User { @TableId(type=IdType.AUTO) private Long id; private String username; private String password; private String role; private String name; private String phone; private LocalDateTime createTime; }
