package cn.luckyqiang.gmall.service.impl;

import cn.luckyqiang.gmall.bean.UserAddress;
import cn.luckyqiang.gmall.service.OrderService;
import cn.luckyqiang.gmall.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName: OrderServiceImpl
 * @Description: TODO
 * @Author: zhangzhiqiang
 * @Date: 2019-09-23 21:50
 * @Company: www.luckyqiang.cn
 */
@Component
public class OrderServiceImpl implements OrderService {


    @Reference
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id："+ userId);
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        return addressList;

    }
}
