package hu.bme.mit.train.tachograph;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import hu.bme.mit.train.interfaces.TrainTachograph;

class TrainTachographImpl implements TrainTachograph {

    Table<Double, Integer, Integer> data;

    public TrainTachographImpl() {
        data = HashBasedTable.create();
    }

    public void recordData(double currenTime, int joystickPosition, int refSpeed) {
        data.put(currenTime, joystickPosition, refSpeed);
    }

    public boolean hasData() {
        return data.isEmpty();
    }

}