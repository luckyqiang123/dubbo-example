package cn.luckyqiang.gmall.service;


import cn.luckyqiang.gmall.bean.UserAddress;

import java.util.List;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author: zhangzhiqiang
 * @Date: 2019-09-23 21:26
 * @Company: www.luckyqiang.cn
 */
public interface UserService {
    public List<UserAddress> getUserAddressList(String userId);
}
