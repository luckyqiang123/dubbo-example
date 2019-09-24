package cn.luckyqiang.gmall.service.impl;

import cn.luckyqiang.gmall.bean.UserAddress;
import cn.luckyqiang.gmall.service.OrderService;
import cn.luckyqiang.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: OrderServiceImpl
 * @Description: TODO
 * @Author: zhangzhiqiang
 * @Date: 2019-09-23 21:50
 * @Company: www.luckyqiang.cn
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    public void initOrder(String userId) {
        System.out.println("用户id："+ userId);
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress.getUserAddress());
        }

    }
}
