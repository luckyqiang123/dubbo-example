package cn.luckyqiang.gmall.controller;

import cn.luckyqiang.gmall.bean.UserAddress;
import cn.luckyqiang.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: zhangzj1103
 * @company: www.chinaunicom.cn
 * @Date: 2019/09/24 10:02
 * @Description:
 */
@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @ResponseBody
    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid") String userId) {
        return orderService.initOrder(userId);
    }
}
