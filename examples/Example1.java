import org.onsignal.rfid.*;

public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		RFIDReader r = new RFIDReader("/dev/tty.SLAB_USBtoUART");
		r.setVerbose(true);

		while (true)
		{
			Thread.sleep(100);
		}
	}

}
