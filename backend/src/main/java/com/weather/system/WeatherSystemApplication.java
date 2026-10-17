package com.weather.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.weather.system.mapper")
public class WeatherSystemApplication {
  public static void main(String[] args) { SpringApplication.run(WeatherSystemApplication.class, args); }
}
