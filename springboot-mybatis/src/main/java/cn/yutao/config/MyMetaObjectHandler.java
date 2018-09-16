package cn.yutao.config;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.sql.Date;

/**
 * 公共字段自动填充
 *
 * @author yutyi
 * @date 2018/09/08
 */
@Configuration
public class MyMetaObjectHandler extends MetaObjectHandler {

    private static Logger logger = LoggerFactory.getLogger(MyMetaObjectHandler.class);

    /**
     * 元对象插入填充
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        Object updateTime = getFieldValByName("updateTime", metaObject);
        logger.debug("***************INSERT自动填充********************");

        if (updateTime == null) {
            setFieldValByName("updateTime",new Date(System.currentTimeMillis()),metaObject);
        }
    }

    /**
     * 元对象更新填充
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        Object updateTime = getFieldValByName("updateTime", metaObject);
        logger.debug("***************UPDATE自动填充********************");
        if (updateTime == null) {
            setFieldValByName("updateTime",new Date(System.currentTimeMillis()),metaObject);
        }
    }
}
