package com.weather.system.controller;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper; import com.weather.system.config.JwtUtil; import com.weather.system.entity.User; import com.weather.system.mapper.UserMapper; import org.springframework.web.bind.annotation.*; import java.time.LocalDateTime; import java.util.*;
@RestController @RequestMapping("/api/auth") public class AuthController { private final UserMapper users; private final JwtUtil jwt; public AuthController(UserMapper u,JwtUtil j){users=u;jwt=j;}
 @PostMapping("/login") public Map<String,Object> login(@RequestBody Map<String,String> p){User u=users.selectOne(new QueryWrapper<User>().eq("username",p.get("username"))); if(u==null||!Objects.equals(u.getPassword(),p.get("password"))) throw new RuntimeException("用户名或密码错误"); Map<String,Object> m=new HashMap<>(); m.put("token",jwt.create(u.getUsername(),u.getRole())); m.put("user",u); return m;}
 @PostMapping("/register") public User register(@RequestBody User u){u.setRole("viewer");u.setCreateTime(LocalDateTime.now());users.insert(u);u.setPassword(null);return u;}
 @GetMapping("/me") public Map<String,Object> me(javax.servlet.http.HttpServletRequest r){Map<String,Object> m=new HashMap<>();m.put("username",r.getAttribute("username"));m.put("role",r.getAttribute("role"));return m;}
 @PutMapping("/password") public void password(@RequestBody Map<String,String> p,javax.servlet.http.HttpServletRequest r){User u=users.selectOne(new QueryWrapper<User>().eq("username",r.getAttribute("username")));u.setPassword(p.get("password"));users.updateById(u);}
}
