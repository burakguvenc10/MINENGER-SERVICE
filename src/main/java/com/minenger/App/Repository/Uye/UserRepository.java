package com.minenger.App.Repository.Uye;

import com.minenger.App.Entity.Uye.LoginUser;
import com.minenger.App.Entity.Uye.User;
import com.minenger.App.Entity.Uye.Uye;
import com.minenger.App.Repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserRepository extends BaseRepository {

    @Autowired
    private IUserRepository userRepository;

    @Transactional
    public User Save(User userDto) {
        return userRepository.save(userDto);
    }

    public LoginUser Login() {
        return null;
    }


}
