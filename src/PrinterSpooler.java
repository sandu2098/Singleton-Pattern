class PrinterSpooler {
    private static PrinterSpooler instance;
    private PrinterSpooler() {
        System.out.println("Printer Spooler Created");
    }
    public static PrinterSpooler getInstance() {
        if (instance == null) {
            instance = new PrinterSpooler();
        }
        return instance;
    }
    public void printDocument(String doc) {
        System.out.println("Printing: " + doc);
    }
}
