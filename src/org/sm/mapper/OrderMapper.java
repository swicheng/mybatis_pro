package org.sm.mapper;

import org.sm.entity.Order;

public interface OrderMapper {

	Order selectOrderByUserId(Integer id);
	
	Order selectOrderById(Integer id);
}
