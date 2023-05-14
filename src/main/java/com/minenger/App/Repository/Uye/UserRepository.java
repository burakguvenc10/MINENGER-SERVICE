package com.minenger.App.Repository.Uye;

import com.minenger.App.Entity.Uye.User;
import com.minenger.App.Repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserRepository extends BaseRepository {

    @Autowired
    private IUserRepository repository;

    @Transactional
    public User Save(User userDto) {
        return repository.save(userDto);
    }


}
