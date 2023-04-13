package com.minenger.App.Repository.Duyurular.jpaRepositories;

import com.minenger.App.Dto.Duyurular.DuyurularRequestDTO;
import com.minenger.App.Entity.Duyurular.Duyuru;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuyurularJpaRepository extends JpaRepository<Duyuru,Long> {

    Duyuru postDuyurularJpa(DuyurularRequestDTO duyurularRequestDTO);
}
