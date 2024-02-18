package com.lava.service;

import com.lava.model.Mobile;

import java.util.List;

public interface MobileService {




    public Mobile saveMobile(Mobile mobile);
    public Mobile updateMobile(Mobile mobile);
    public void deleteMobile(Integer id);
    public Mobile getMobile(Integer id);
    public List<Mobile> getAllMobile();


}
