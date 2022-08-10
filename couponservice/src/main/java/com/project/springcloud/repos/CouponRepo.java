package com.project.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.springcloud.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

}
