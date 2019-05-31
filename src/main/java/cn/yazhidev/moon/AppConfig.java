package cn.yazhidev.moon;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//作用类似于我们在web项目中配置springmvc-servlet.xml 指定我们需要开启mvc注解，扫描controller控制器所在文件夹
@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"cn.yazhidev.moon.controller"})
public class AppConfig {
}
