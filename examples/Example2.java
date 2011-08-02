import org.onsignal.rfid.*;
import gnu.io.*;

public class Example2 
{
	public class TagListener implements RFIDListener
	{
	    public void tagAdded(RFIDTagEvent e) {
	    	System.out.println("Tag " + e.getTag() + " was added to reader " + e.getReader());
	    }

	    public void tagRemoved(RFIDTagEvent e) {
	    	System.out.println("Tag " + e.getTag() + " was removed from reader " + e.getReader());
	    }
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		(new Example2()).run();
	}
	
	void run() throws InterruptedException
	{
		try {
			RFIDReader r = new RFIDReader("/dev/tty.SLAB_USBtoUART", new TagListener());
			
	    } catch (NoSuchPortException e) {
	    	System.out.println("No such port!");
	    	return;
	    } catch (PortInUseException e) {
	    	System.out.println(e.getMessage());
	    	return;
        }
	    			

		while (true)
		{
			Thread.sleep(100);
		}
		
	}

}
