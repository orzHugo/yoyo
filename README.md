# YOYO 🔒  
**基于 Spring WebFlux 的响应式动态鉴权系统**  
*最后更新：2025年5月21日 10:25 星期三（农历四月廿四）*  
 
---
 
## 🌐 项目概览  
利用 **Spring WebFlux 响应式编程模型**与 **Sa-Token 动态权限框架**，构建支持实时权限热更新、多维度访问控制的高性能鉴权服务。核心能力包括：  
✅ 动态路由鉴权（基于API路径/请求方法/业务标签）  
✅ RBAC（角色-权限-资源）三级权限模型  
✅ 分布式会话管理（集成Reactive Redis）  
✅ 实时权限变更推送（WebSocket + Server-Sent Events）  
 
---
 
## 🧩 技术架构全景  
### **核心组件矩阵**  
| 模块               | 技术选型                             | 版本     | 核心作用                  |  
|--------------------|------------------------------------|--------|-------------------------|  
| 响应式框架         | Spring WebFlux                    | 3.4.5  | 非阻塞式请求处理           |  
| 鉴权框架          | Sa-Token + Reactive Redis         | 1.37.0 | 动态权限校验与会话存储      |  
| 数据库            | R2DBC (PostgreSQL)                | 1.5.7  | 异步资源规则存储           |  
| 消息推送          | Project Reactor + RSocket         | 3.6.2  | 实时权限变更通知           |  
 
### **动态鉴权流程**  
```mermaid  
graph TD  
    A[客户端请求] --> B{Sa-Token拦截器}  
    B -->|携带Token| C[Reactive Redis校验会话]  
    C --> D[加载动态权限规则]  
    D --> E{匹配资源策略?}  
    E -->|是| F[执行目标方法]  
    E -->|否| G[返回403 Forbidden]  
    G --> H[记录审计日志]  
