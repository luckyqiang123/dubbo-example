package cn.luckyqiang.gmall.service.impl;

import cn.luckyqiang.gmall.bean.UserAddress;
import cn.luckyqiang.gmall.service.OrderService;
import cn.luckyqiang.gmall.service.UserService;

import java.util.List;

/**
 * @ClassName: OrderServiceImpl
 * @Description: TODO
 * @Author: zhangzhiqiang
 * @Date: 2019-09-23 21:50
 * @Company: www.luckyqiang.cn
 */
public class OrderServiceImpl implements OrderService {

    UserService userService;

    public void initOrder(String userId) {
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        System.out.println(addressList);
    }
}
