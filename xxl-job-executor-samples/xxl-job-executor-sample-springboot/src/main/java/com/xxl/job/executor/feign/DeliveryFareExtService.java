package com.xxl.job.executor.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "delivery-order")
public interface DeliveryFareExtService {

    /**
     * 查询订单价格详情信息
     * @return
     */
    @RequestMapping(value = "/queryFareExtById",method = RequestMethod.POST)
    DeliveryFareExtOutputDto queryFareExtById(String orderId);

}
