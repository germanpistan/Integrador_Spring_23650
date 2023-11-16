package com.ar.cac.tpfinal.repositories;

import com.ar.cac.tpfinal.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository <Account, Long> {
}
