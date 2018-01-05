package com.atguigu.service;

import java.util.List;

import com.atguigu.bean.T_MALL_ADDRESS;

public interface AddressService {

	void save_address(T_MALL_ADDRESS address);

	List<T_MALL_ADDRESS> query_address_by_user_id(Integer user_id);

	T_MALL_ADDRESS query_address_by_id(Integer id);

}
