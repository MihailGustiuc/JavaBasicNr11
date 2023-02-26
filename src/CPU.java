public class CPU {
    CPU cpu = new CPU();
//    private Processor processor;
//    private RAM ram;
//
//    public CPU() {
//        processor = new Processor();
//        ram = new RAM();
//    }

    // Processor inner class
    private class Processor {
        Processor processor = new Processor();

        // implementation omitted for brevity
    }

    // RAM inner class
    private class RAM {
        RAM ram = new RAM();
        // implementation omitted for brevity
    }
}
