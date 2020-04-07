package com.xxl.job.executor.feign;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryFareExtOutputDto implements Serializable {

    private String orderParent;

    private String orderNo;

    private BigDecimal startFare;
    /**
     * 里程费
     */
    private BigDecimal milePrice;
    /**
     * 夜间费
     */
    private BigDecimal nightPrice;
    /**
     * 远途费
     */
    private BigDecimal overMilePrice;
    /**
     * 超重费
     */
    private BigDecimal weightPrice;
    /**
     * 总价
     */
    private BigDecimal totalPrice;
    /**
     * 优惠价格
     */
    private BigDecimal discountPrice;
    /**
     * 实际价格
     */
    private BigDecimal actualPrice;



}
