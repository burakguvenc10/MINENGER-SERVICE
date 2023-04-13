package com.minenger.App.Repository.Duyurular.jpaRepositories;

import com.minenger.App.Dto.Duyurular.DuyurularRequestDTO;
import com.minenger.App.Entity.Duyurular.Duyuru;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public abstract class DuyurularJpaRepository implements IDuyurularJpaRepository {

    @Autowired
    private final IDuyurularJpaRepository duyurularJPARepository;

    public DuyurularJpaRepository(IDuyurularJpaRepository duyurularJPARepository) {
        this.duyurularJPARepository = duyurularJPARepository;
    }

    @Override
    public Duyuru postDuyurularJpa(DuyurularRequestDTO duyurularRequestDTO) {
        return this.duyurularJPARepository.postDuyurularJpa(duyurularRequestDTO);

    }

}
