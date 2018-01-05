package com.atguigu.mapper;

import java.util.List;

import com.atguigu.bean.T_MALL_ADDRESS;

public interface AddressMapper {

	void insert_address(T_MALL_ADDRESS address);

	List<T_MALL_ADDRESS> select_address_by_user_id(Integer user_id);

	T_MALL_ADDRESS select_address_by_id(Integer id);

}
