package com.exe.cozy.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exe.cozy.domain.CustomerDto;
import com.exe.cozy.domain.ReplyDto;
import com.exe.cozy.mapper.CustomerMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public int emailChk(String customerEmail) {
		return customerMapper.emailChk(customerEmail);
	}
	
	@Override
	public void insertData(CustomerDto dto) {
		customerMapper.insertData(dto);
	}

	@Override
	public CustomerDto getLogin(String customerEmail) {
		return customerMapper.getLogin(customerEmail);
	}

	@Override
	public CustomerDto forgot(String customerEmail) {
		return customerMapper.forgot(customerEmail);
	}
	
	@Override
	public void updatePwd(CustomerDto dto) {
		customerMapper.updatePwd(dto);
	}

	@Override
	public CustomerDto getReadData(String customerEmail) {
		return customerMapper.getReadData(customerEmail);		
	}

	@Override
	public void updateData(CustomerDto dto) {
		customerMapper.updateData(dto);
	}

	@Override
	public void deleteData(String customerEmail) {
		customerMapper.deleteData(customerEmail);
	}

	@Override
	public void updatePoint(CustomerDto dto) {
		customerMapper.updatePoint(dto);
	}

	@Override
	public List<ReplyDto> getReviewList(String customerEmail) {
		return customerMapper.getReviewList(customerEmail);
	}


}
