# 气象设备管理系统

技术栈：Spring Boot 2.7 + MyBatis-Plus + MySQL 8 + Vue 3 + Element Plus + ECharts。

## 启动

1. 新装数据库执行 `sql/init.sql`；已有项目执行 `sql/upgrade.sql`，补充告警和保养计划表。
2. 复制 `backend/src/main/resources/application.yml.example` 为 `application.yml`，并设置 `DB_PASSWORD` 和 `JWT_SECRET` 环境变量；其余数据库参数可按需调整。公开仓库不包含本地配置文件。
3. 后端：`cd backend` 后执行 `mvn spring-boot:run`。
4. 前端：`cd frontend`、`npm install`、`npm run dev`，访问终端提示地址。

演示账号：`admin/123456`（管理员）、`maintainer/123456`（维护员）、`viewer/123456`（查看用户），仅用于本地演示；部署前请更换默认凭据。

## 功能

登录注册、角色菜单与接口权限、设备台账分页筛选、站点管理、维修记录、保养计划、设备告警、操作日志、设备详情、气象数据模拟上传、ECharts 趋势图、数据分析、统计仪表盘、公告通知、设备 CSV 导出。
