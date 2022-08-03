public class PK {

    private int memory;
    private int cpu;
    private String name;

    PK() {};

    PK (int memory, int cpu, String name) {
        this.memory = memory;
        this.name = name;
        this.cpu = cpu;
    }

    void getCpu() {
        System.out.println(cpu);
    }

    void getName() {
        System.out.println(name);
    }

    void getMemory() {
        System.out.println(memory);
    }

    void setMemory(int m) {
        memory = m;
    }

    void setCpu(int c) {
        cpu = c;
    }

    void setName(String n) {
        name = n;
    }
}
