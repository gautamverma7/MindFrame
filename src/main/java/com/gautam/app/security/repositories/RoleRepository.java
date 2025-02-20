package com.gautam.app.security.repositories;

import com.gautam.app.security.entities.AppRole;
import com.gautam.app.security.entities.Role;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}