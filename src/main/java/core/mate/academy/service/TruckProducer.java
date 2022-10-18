package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    public List<Truck> get() {
        return List.of(new Truck(), new Truck());
    }
}
