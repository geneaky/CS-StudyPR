package facadepattern;

public class Computer {

    public void startComputer() {
        HardDrive hardDrive = new HardDrive();
        hardDrive.readDrive();
        Memory memory = new Memory();
        memory.readMemory();
        Cpu cpu = new Cpu();
        cpu.useCpu();
    }
}
