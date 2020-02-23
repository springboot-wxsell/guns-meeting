package com.david.meeting.api.order;

import com.david.meeting.api.order.vo.OrderVO;

import java.util.List;

/**
 * @author : wangwei
 * @date : Created in 2020/2/23 14:21
 * @description: ${description}
 * @modified By:
 * @version: ${version}
 */
public interface OrderServiceApi {

    // 验证售出的票是否为真
    boolean isTrueSeats(Integer fieldId, String seats);

    // 已经销售的座位处理，有没有这些座位
    boolean isNotSoldSeats(String fieldId, String seats);

    // 创建订单信息
    OrderVO createOrder(Integer fieldId, String soldSeats, String seatsName, Integer userId);

    // 根据当前登录人获取已购买的订单信息
    List<OrderVO> getOrderByUserId(Integer userId);

    // 根据 fieldId 获取所有已经销售的座位编号
    String getSoldSeatsByFieldId(Integer fieldId);
}