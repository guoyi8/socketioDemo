package com.jp.dao;

import org.springframework.data.repository.CrudRepository;

import com.jp.entity.ClientInfo;

public interface ClientInfoDao extends CrudRepository<ClientInfo, String> {
	ClientInfo findClientByclientid(String clientId);
}