package ar.com.cac.repository;

import ar.com.cac.entity.User;

public interface LoginRepository {

    public User login(String username, String password);
}