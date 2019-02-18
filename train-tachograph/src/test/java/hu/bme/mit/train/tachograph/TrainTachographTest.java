package hu.bme.mit.train.tachograph;


import hu.bme.mit.train.interfaces.TrainTachograph;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TrainTachographTest {

    TrainTachograph tachograph;

    @Before
    public void before() {
        tachograph = new TrainTachographImpl();
    }

    @Test
    public void dataTest() {
        tachograph.recordData(112.12, 30, 40);
        Assert.assertFalse(tachograph.hasData());
    }
}