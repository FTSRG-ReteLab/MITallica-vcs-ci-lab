package hu.bme.mit.train.interfaces;

public interface TrainTachograph {
    public void recordData(double currenTime, int joystickPosition, int refSpeed);

    public boolean hasData();

}
