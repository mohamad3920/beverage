package com.assignment.onlineShop.repository;

import com.assignment.onlineShop.repository.entity.ShopOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<ShopOrder, Long> {
}
