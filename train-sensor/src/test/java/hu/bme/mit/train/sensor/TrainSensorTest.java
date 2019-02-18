package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.system.TrainSystem;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainSensorTest {
	TrainController controller;
	TrainSensor sensor;
	TrainUser user;

    @Before
    public void before() {
	TrainSystem system = new TrainSystem();
	controller = system.getController();
	sensor = system.getSensor();
	user = system.getUser();

    }

    @Test
    public void overrideSpeedLimitTest() {
		int origSpeed = sensor.getSpeedLimit();
		sensor.overrideSpeedLimit(10);
        //Assert.assertEquals(origSpeed, 10, "Speed should be 10 after override");
		Assert.assertEquals(origSpeed, 10);

    }
}
