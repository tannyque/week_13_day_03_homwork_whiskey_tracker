package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

    @Autowired
    WhiskyRepository whiskyRepository;

    @Autowired
    DistilleryRepository distilleryRepository;

	@Test
	public void contextLoads() {
	}

    @Test
    public void canGetWhiskiesByYear() {
	    List<Whisky> foundWhiskies = whiskyRepository.getWhiskiesForYear(1995);
    }

    @Test
    public void canGetWhiskiesByRegion() {
        List<Whisky> foundWhiskies = whiskyRepository.getWhiskiesForRegion("Highland");
    }

    @Test
    public void canGetDistilleriesByRegion() {
	    List<Distillery> foundDistilleries = distilleryRepository.getDistilleriesForRegion("Lowland");
    }

    @Test
    public void canGetWhiskyByDistilleryAndAge() {
        List<Whisky> foundWhiskies = whiskyRepository.getWhiskiesByDistilleryAndAge("Rosebank", 12);
    }

    @Test
    public void canGetDistilleriesWithWhiskyAged12() {
	    List<Distillery> foundDistilleries = distilleryRepository.getDistilleriesForWhiskeyAged12(12);
    }
}
