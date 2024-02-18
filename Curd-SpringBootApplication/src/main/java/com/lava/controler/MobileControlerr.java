package com.lava.controler;

import com.lava.model.Mobile;
import com.lava.response.ResponseHandler;
import com.lava.service.MobileService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MobileControlerr {
    @Autowired
    private MobileService mser;

    @PostMapping("/save")
    public String saveMobile(@RequestBody  @Valid Mobile mobile) {
        Mobile m=mser.saveMobile(mobile);
        String message=null;
        if(m!=null) {
            message="mobile saved Successfully";

        }
        else {
            message="not saved";
        }
        return message;
    }

    @PutMapping("/update/{id}")
    public Mobile updateMobile(@RequestBody Mobile mobile,@PathVariable Integer id) {
        Mobile mres=mser.getMobile(id);
        Mobile m=new Mobile();
        m.setId(id);
        m.setMobileName(mobile.getMobileName());
        m.setRam(mobile.getRam());
        m.setDisplay(mobile.getDisplay());
        m.setBackCam(mobile.getBackCam());
        m.setProcessor(mobile.getProcessor());
        m.setBattery(mobile.getBattery());
        m.setColor(mobile.getColor());
        m.setFrontCam(mobile.getFrontCam());
        Mobile r=mser.updateMobile(m);
        return r;

    }
    @GetMapping("/get/{id}")

    public ResponseEntity<Object> getMobile(@PathVariable Integer id, String message) {

        return	ResponseHandler.responseBuilder(message, "Request id given here", HttpStatus.OK,
                mser.getMobile(id));


    }

    @DeleteMapping("/delete/{id}")
    public void deleteMobile(@PathVariable Integer id) {
        mser.deleteMobile(id);
    }


    @GetMapping("/getAll")
    public List<Mobile> getAll(){
        List<Mobile>mlist=mser.getAllMobile();
        return mlist;
    }
}
