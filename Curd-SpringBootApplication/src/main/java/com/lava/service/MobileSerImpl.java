package com.lava.service;

import com.lava.exception.MobileNotFoundException;
import com.lava.model.Mobile;
import com.lava.repository.Mobilerepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MobileSerImpl implements MobileService {
    @Autowired

    private Mobilerepo repo;

    public MobileSerImpl(Mobilerepo repo) {
        this.repo=repo;
    }


    @Override
    public Mobile saveMobile(Mobile mobile) {
        // TODO Auto-generated method stub
      Mobile m=  repo.save(mobile);

        return m;
    }

    @Override
    public Mobile updateMobile(Mobile mobile) {
        // TODO o-generated method stub
        Mobile mobile1=repo.save(mobile);
        return mobile1;
    }



    @Override
    public Mobile getMobile(Integer id) {
        if(repo.findById(id).isEmpty())
            throw new MobileNotFoundException("requested id not exist");
        // TODO Auto-generated method stub
        Optional<Mobile> mobile=repo.findById(id);
        Mobile mobileres=mobile.get();
        return mobileres;
    }

    @Override
    public List<Mobile> getAllMobile() {
        // TODO Auto-generated method stub
        List<Mobile>m=repo.findAll();
        return m;
    }

    @Override
    public void deleteMobile(Integer id) {
        // TODO Auto-generated method stub
        repo.deleteById(id);
    }


}

