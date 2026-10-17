package com.weather.system.entity;
import com.baomidou.mybatisplus.annotation.*; import lombok.Data; import java.math.BigDecimal;
@Data @TableName("station") public class Station { @TableId(type=IdType.AUTO) private Long id; private String name; private String address; private BigDecimal longitude; private BigDecimal latitude; private String manager; }
