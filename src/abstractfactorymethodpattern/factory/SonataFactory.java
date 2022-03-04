package abstractfactorymethodpattern.factory;

import abstractfactorymethodpattern.Frame;
import abstractfactorymethodpattern.SonataFrame;
import abstractfactorymethodpattern.SonataWheel;
import abstractfactorymethodpattern.Wheel;

public class SonataFactory implements CarFactory{
    @Override
    public Frame createFrame() {
        return new SonataFrame();
    }

    @Override
    public Wheel createWheel() {
        return new SonataWheel();
    }
}
