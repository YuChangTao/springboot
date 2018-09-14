package cn.yutao.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 异常处理器
 *
 * @author yutyi
 * @date 2018/09/13
 */
@ControllerAdvice
public class MyExceptionHandler {

    /**
     * 异常直接会被ExceptionHandler处理，返回自定义的json数据
     * @param e
     * @param request
     * @return
     */
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Map<String,Object> handleException(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>(16);
        map.put("code","user.notexist");
        map.put("message",e.getMessage());
        return map;
    }

    /**
     * 将ExceptionHandler与BasicErrorController结合使用，实现针对不同的客户端显示text/html或json
     * @param e
     * @param request
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    public String handleRuntimeException(Exception e, HttpServletRequest request) {
        //DefaultErrorAttributes从request中获取
        request.setAttribute("javax.servlet.error.status_code",400);
        request.setAttribute("javax.servlet.error.message","用户名错误");
        request.setAttribute("code","user.notexist");
        //转发到BasicErrorController
        return "forward:/error";
    }
}
