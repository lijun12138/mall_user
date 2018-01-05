package com.atguigu.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.T_MALL_ADDRESS;
import com.atguigu.mapper.AddressMapper;
import com.atguigu.service.AddressService;

@Service
public class AddressServiceImp implements AddressService {
	
	@Autowired
	private AddressMapper addressMapper;

	@Override
	public void save_address(T_MALL_ADDRESS address) {
		addressMapper.insert_address(address);
	}

	@Override
	public List<T_MALL_ADDRESS> query_address_by_user_id(Integer user_id) {
		List<T_MALL_ADDRESS> addresses = addressMapper.select_address_by_user_id(user_id);
		return addresses;
	}

	@Override
	public T_MALL_ADDRESS query_address_by_id(Integer id) {
		T_MALL_ADDRESS address = addressMapper.select_address_by_id(id);
		return address;
	}
}
