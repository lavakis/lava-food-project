package com.lava.repository;

import com.lava.model.Mobile;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class MobileRepositoryTest {

    @Autowired
    private Mobilerepo mobileRepo;
    Mobile mobile;

    @BeforeEach
    void setUp() {
        mobile = new Mobile(1,"apple","32gb","6000",
                "16mp","10mp","6.1","600amh","black");
        mobileRepo.save(mobile);
    }

    @AfterEach
    void tearDown() {
        mobile = null;
        mobileRepo.deleteAll();
    }

    //Test Cases True
@Test
    void TestFindByMobileName_Found(){
        List<Mobile> mobileList=mobileRepo.findByMobileName("apple");
        assertThat(mobileList.get(0).getId()).isEqualTo(mobile.getId());
        assertThat(mobileList.get(0).getColor()).isEqualTo(mobile.getColor());
        assertThat(mobileList.get(0).getBackCam()).isEqualTo(mobile.getBackCam());
        assertThat(mobileList.get(0).getBattery()).isEqualTo(mobile.getBattery());
        assertThat(mobileList.get(0).getDisplay()).isEqualTo(mobile.getDisplay());
        assertThat(mobileList.get(0).getFrontCam()).isEqualTo(mobile.getFrontCam());

    }

    // Test Cases fail
    @Test
    void TestFindByMobileName_NotFound(){
        List<Mobile> mobileList=mobileRepo.findByMobileName("lava");
    assertThat(mobileList.isEmpty()).isTrue();
    }
}

