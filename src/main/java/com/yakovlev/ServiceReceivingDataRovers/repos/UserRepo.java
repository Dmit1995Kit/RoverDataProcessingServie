package com.yakovlev.ServiceReceivingDataRovers.repos;

import com.yakovlev.ServiceReceivingDataRovers.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
