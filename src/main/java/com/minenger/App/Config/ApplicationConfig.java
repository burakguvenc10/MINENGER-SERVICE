package com.minenger.App.Config;

import com.minenger.App.Repository.Uye.IUyeRepository;
import com.minenger.App.Service.Uye.UyeServices;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {

    //private final IUyeRepository repository;

    /*@Bean
    public UyeServices uyeServices(){
        return new UyeServices(){
            @Override
            public UyeServices loadUserBymail(String mail) throws UsernameNotFoundException{
                return null;
            }
        }
    }*/

}
