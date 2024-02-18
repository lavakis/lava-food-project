package com.lava.serviceImpl;

import com.lava.model.Mobile;
import com.lava.repository.Mobilerepo;
import com.lava.service.MobileSerImpl;
import com.lava.service.MobileService;

import org.assertj.core.api.AbstractBigDecimalAssert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MobileServiceImplTest {


    @Mock
    private Mobilerepo mobilerepo;
     private MobileService mobileService;
     AutoCloseable autoCloseable;
     Mobile mobile;

    @BeforeEach
    void setUp() {
autoCloseable= MockitoAnnotations.openMocks(this);
mobileService =new MobileSerImpl(mobilerepo);
        mobile = new Mobile(1,"apple","32gb","6000",
                "16mp",
                "10mp","6.1","600amh","black");

    }

    @AfterEach
    void tearDown () throws Exception {
autoCloseable.close();
    }




    @Test
    void updateMobile(){

    }

    @Test
    void deleteMobile(){

    }
    @Test
    void getMobile(){


    }



    @Test
    void getAllMobile(){

    }
    @Test
    void getByMobileName(){

    }
}
