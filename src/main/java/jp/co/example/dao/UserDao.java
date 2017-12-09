package jp.co.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.example.entity.Account;

public interface UserDao extends JpaRepository <Account, Integer> {

    public List<Account> findByName(String name);
}
