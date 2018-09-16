package cn.yutao.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;
import com.baomidou.mybatisplus.plugins.SqlExplainInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yutyi
 * @date 2018/09/16
 */
@Configuration
public class MybatisPlusConfig {

    /**
     * MybatisPlus分页插件
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        //设置为true，启用pageHeper支持
        paginationInterceptor.setLocalPage(true);
        return paginationInterceptor;
    }

    /**
     * SQL执行分析插件，开发环境使用，线上不推荐
     * @return
     */
    @Bean
    public SqlExplainInterceptor sqlExplainInterceptor() {
        SqlExplainInterceptor sqlExplainInterceptor = new SqlExplainInterceptor();
        //发现全表执行 delete update停止运行
        sqlExplainInterceptor.setStopProceed(true);
        return sqlExplainInterceptor;
    }

    /**
     * SQL 执行性能分析，开发环境使用，线上不推荐
     * @return
     */
    @Bean
    public PerformanceInterceptor performanceInterceptor() {
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        //SQL 执行最大时长，超过自动停止运行，有助于发现问题，单位ms
        performanceInterceptor.setMaxTime(1000);
        //SQL是否格式化
        performanceInterceptor.setFormat(true);
        return performanceInterceptor;
    }
}
