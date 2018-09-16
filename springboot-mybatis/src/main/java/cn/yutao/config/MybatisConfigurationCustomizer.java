package cn.yutao.config;

import com.baomidou.mybatisplus.spring.boot.starter.ConfigurationCustomizer;
import org.apache.ibatis.session.Configuration;
import org.springframework.stereotype.Component;

/**
 * 使用Mybatis或MybatisPlus时注意切换包
 * @author yutyi
 * @date 2018/09/16
 */
@Component
public class MybatisConfigurationCustomizer implements ConfigurationCustomizer {
    @Override
    public void customize(Configuration configuration) {
        configuration.setCacheEnabled(true);
    }
}
