package io.javafullstack.stockmarketapp.userlogin;

import org.springframework.data.jpa.repository.JpaRepository;

import io.javafullstack.stockmarketapp.userlogin.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
