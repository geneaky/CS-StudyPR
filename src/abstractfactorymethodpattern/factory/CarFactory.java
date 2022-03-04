package abstractfactorymethodpattern.factory;

import abstractfactorymethodpattern.Frame;
import abstractfactorymethodpattern.Wheel;

public interface CarFactory {

    Frame createFrame();
    Wheel createWheel();
}
