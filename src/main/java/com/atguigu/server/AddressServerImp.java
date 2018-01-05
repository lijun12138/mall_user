package com.atguigu.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.atguigu.bean.T_MALL_ADDRESS;
import com.atguigu.service.AddressService;

public class AddressServerImp implements AddressServer{

	@Autowired
	private AddressService addressService;
	
	@Override
	public void save_address(T_MALL_ADDRESS address) {
		addressService.save_address(address);
	}

	@Override
	public List<T_MALL_ADDRESS> query_address_by_user_id(Integer user_id) {
		List<T_MALL_ADDRESS> addresses = addressService.query_address_by_user_id(user_id);
		return addresses;
	}

	@Override
	public T_MALL_ADDRESS query_address_by_id(Integer id) {
		T_MALL_ADDRESS address = addressService.query_address_by_id(id);
		return address;
	}

}
