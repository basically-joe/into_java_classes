import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 50);
    }

    @Test
    public void getPaperVolume() {
        assertEquals(100, printer.getPaperVolume());
    }


    @Test
    public void getTonerVolume() {
        assertEquals(50, printer.getTonerVolume());
    }

    @Test
    public void printPass() {

        assertEquals(true, printer.print(5, 2));
        assertEquals(90, printer.getPaperVolume());
        assertEquals(40, printer.getTonerVolume());
    }

    @Test
    public void printFail() {
        assertEquals(false, printer.print(35, 2));
    }

    @Test
    public void refill() {
        assertEquals(100, printer.refillPaper());
    }


}
