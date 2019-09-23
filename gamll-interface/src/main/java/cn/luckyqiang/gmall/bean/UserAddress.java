package cn.luckyqiang.gmall.bean;

import java.io.Serializable;

/**
 * @ClassName: UserAddress
 * @Description: TODO
 * @Author: zhangzhiqiang
 * @Date: 2019-09-23 21:21
 * @Company: www.luckyqiang.cn
 */
public class UserAddress implements Serializable {

    private  Integer Id;
    private String userAddress;
    private String userid;
    private String consignee;
    private String phoneNbr;
    private String isDefault;

    public UserAddress(Integer id, String userAddress, String userid, String consignee, String phoneNbr, String isDefault) {
        Id = id;
        this.userAddress = userAddress;
        this.userid = userid;
        this.consignee = consignee;
        this.phoneNbr = phoneNbr;
        this.isDefault = isDefault;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPhoneNbr() {
        return phoneNbr;
    }

    public void setPhoneNbr(String phoneNbr) {
        this.phoneNbr = phoneNbr;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }
}
