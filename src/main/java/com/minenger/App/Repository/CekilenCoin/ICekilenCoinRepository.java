package com.minenger.App.Repository.CekilenCoin;

import com.minenger.App.Entity.CekilenCoin.CekilenCoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICekilenCoinRepository extends JpaRepository<CekilenCoin, Long> {


}
