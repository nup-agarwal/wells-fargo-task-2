package com.wellsfargo.repositories;

import com.wellsfargo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Additional query methods can be defined here
}
