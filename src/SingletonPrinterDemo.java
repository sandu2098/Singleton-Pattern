public class SingletonPrinterDemo {
    public static void main(String[] args) {
        PrinterSpooler p1 = PrinterSpooler.getInstance();
        PrinterSpooler p2 = PrinterSpooler.getInstance();
        p1.printDocument("Report.pdf");
        p2.printDocument("Assignment.docx");
        System.out.println(p1 == p2); // true
    }
}

