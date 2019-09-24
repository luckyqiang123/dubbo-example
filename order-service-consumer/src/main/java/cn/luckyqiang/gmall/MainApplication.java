package cn.luckyqiang.gmall;

import cn.luckyqiang.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author: zhangzj1103
 * @company: www.chinaunicom.cn
 * @Date: 2019/09/24 09:45
 * @Description:
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = applicationContext.getBean(OrderService.class);
        orderService.initOrder("1");
        System.out.println("调用结束");
        System.in.read();
    }
}
