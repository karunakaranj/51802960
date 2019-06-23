package com.BankLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.codec.CodecConfigurer.CustomCodecs;
import org.springframework.stereotype.Repository;

@Repository
public interface customerrepo extends JpaRepository <customer,integer>{
	
public CustomCodecs findbyId(customer,integer);
public customer findbyName(customer,String);

}
