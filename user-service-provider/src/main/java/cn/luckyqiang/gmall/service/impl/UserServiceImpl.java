package cn.luckyqiang.gmall.service.impl;

import cn.luckyqiang.gmall.bean.UserAddress;
import cn.luckyqiang.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Author: zhangzhiqiang
 * @Date: 2019-09-23 21:36
 * @Company: www.luckyqiang.cn
 */
public class UserServiceImpl implements UserService {
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "北京市昌平区科技园", "1", "李老师", "13823838438", "Y");
        UserAddress address2 = new UserAddress(1, "深圳市南山区腾讯滨海大厦", "1", "马化楞", "15666531259", "Y");
        return Arrays.asList(address1, address2);
    }
}
