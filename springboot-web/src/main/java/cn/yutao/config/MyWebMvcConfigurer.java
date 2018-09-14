package cn.yutao.config;

import cn.yutao.servlet.MyFilter;
import cn.yutao.servlet.MyListener;
import cn.yutao.servlet.MySerlvet;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Arrays;

/**
 * SpringMVC扩展配置
 * @author yutyi
 * @date 2018/09/13
 */
@Configuration
public class MyWebMvcConfigurer extends WebMvcConfigurerAdapter {
    /**
     * 添加viewController
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //等同于mvc:view-controller配置
        registry.addViewController("/success").setViewName("success");
    }

    /**
     *  配置Servlet容器
     * @return
     */
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                factory.setPort(8080);
            }
        };
    }

    /**
     * 注册Servlet组件
     * @return
     */
    @Bean
    public ServletRegistrationBean myServlet() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean();
        registrationBean.setServlet(new MySerlvet());
        registrationBean.setUrlMappings(Arrays.asList("/myServlet"));
        return registrationBean;
    }

    /**
     * 注册Filter组件
     * @return
     */
    @Bean
    public FilterRegistrationBean myFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        return filterRegistrationBean;
    }

    /**
     * 注册Listener组件
     * @return
     */
    @Bean
    public ServletListenerRegistrationBean myListener() {
        ServletListenerRegistrationBean listenerRegistrationBean = new ServletListenerRegistrationBean();
        listenerRegistrationBean.setListener(new MyListener());
        return listenerRegistrationBean;
    }
}
