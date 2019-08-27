
                    SpringBoot创建自定义的starter 
 
 
 1. 创建auto项目 和 starter项目
 
 2. 修改auto项目 创建自动配置类   HelloAutoConfiguration 
 
 3. 在resource中 创建META-INF/spring.factories  添加 自动配置类
    org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
        com.rose.hello.service.HelloAutoConfiguration
 4. 修改 starter项目  删除java test包 只留 pom  删除pom 中其余依赖  引入 auto 依赖
 
 5. 测试
  
