package com.entry;

import com.petstore.delegates.StoreApiImp;
import gen.petstore.api.StoreApiController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.List;

//@Configuration
//@EnableAspectJAutoProxy
@SpringBootApplication
@ComponentScan(basePackages = "com.ex ample", excludeFilters = {
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.example.demo.*")
        })
public class Application {

    public static void main(String[] args) {
        StoreApiController sac=new StoreApiController(new StoreApiImp.StoreApiDelegateImp());
        new StoreApiImp.StoreApiDelegateImp();
        SpringApplication.run(Application.class, args);
    }

    private ServletRegistrationBean<DispatcherServlet> createChildServlet(List<String> urlMappings,
                                                                          Class<?> configuration, String servletRegistrationBeanName, ApplicationContext parent) {

        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(configuration);
        applicationContext.setParent(parent);
        DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean<>(dispatcherServlet,
                urlMappings.toArray(new String[] {}));
        servletRegistrationBean.setName(servletRegistrationBeanName);
        servletRegistrationBean.setLoadOnStartup(1);
        return servletRegistrationBean;
    }

}