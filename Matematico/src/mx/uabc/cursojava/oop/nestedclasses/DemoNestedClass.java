package mx.uabc.cursojava.oop.nestedclasses;

public class DemoNestedClass {
    public static void main (String[] args){
        CPU cpu = new CPU();
        CPU.Processor p = cpu.new Processor();
        CPU.RAM r = cpu.new RAM();

        CPUMejorado cpuMejorado = new CPUMejorado();
        CPUMejorado.Processor pM = cpuMejorado.new Processor();
        CPUMejorado.RAM rM = cpuMejorado.new RAM();

        pM.setCores(8);
        pM.setManufacturer("Intel");

    }
}
