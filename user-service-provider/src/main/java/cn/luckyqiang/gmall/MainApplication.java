package cn.luckyqiang.gmall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName: MainApplication
 * @Description: TODO
 * @Author: zhangzhiqiang
 * @Date: 2019-09-23 22:29
 * @Company: www.luckyqiang.cn
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();
        System.in.read();
    }
}
