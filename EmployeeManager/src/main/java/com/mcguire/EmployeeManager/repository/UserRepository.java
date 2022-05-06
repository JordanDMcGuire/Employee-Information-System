package com.mcguire.EmployeeManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mcguire.EmployeeManager.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
}
