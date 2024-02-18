package com.lava.repository;

import com.lava.model.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Mobilerepo extends JpaRepository<Mobile,Integer> {
    List<Mobile> findByMobileName(String mobileName);

}
