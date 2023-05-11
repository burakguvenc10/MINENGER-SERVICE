package com.minenger.App.Repository.Uye;

import com.minenger.App.Dto.Uye.UyeRequestDTO;
import com.minenger.App.Entity.Uye.User;
import com.minenger.App.Repository.BaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends BaseRepository {

    @Autowired
    private IUserRepository repository;

    @Transactional
    public User Save(User userDto) {
        return repository.save(userDto);
    }


}
