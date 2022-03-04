package abstractfactorymethodpattern.factory;

import abstractfactorymethodpattern.AvanteFrame;
import abstractfactorymethodpattern.AvanteWheel;
import abstractfactorymethodpattern.Frame;
import abstractfactorymethodpattern.Wheel;

public class AvanteFactory implements CarFactory{
    @Override
    public Frame createFrame() {
        return new AvanteFrame();
    }

    @Override
    public Wheel createWheel() {
        return new AvanteWheel();
    }
}
