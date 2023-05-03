package com.minenger.App.Repository.Uye;

import com.minenger.App.Entity.Uye.Uye;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUyeRepository extends JpaRepository<Uye, Long> {
}
