package com.minenger.App.Entity;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import jakarta.persistence.Table;

public class BaseEntity {

    @SneakyThrows
    @Override
    public String toString(){
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }

    public String getTableName(){
        return this.getClass().getAnnotation(Table.class).name();
    }

}
