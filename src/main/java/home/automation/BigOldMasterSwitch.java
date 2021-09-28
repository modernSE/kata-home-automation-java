package home.automation;


import java.util.List;
import java.util.Arrays;


/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch {

	private boolean isOn = false;

	private List<IDevice> myDevices;

	public BigOldMasterSwitch(List<IDevice> devices){
		myDevices = devices;
	} 

	/*
	private void getMyDevices(){
		List<IDevice> devices = Arrays.asList(shutter,airConditioning,lights,stereo, coffeeMaker );	
	}*/


	public void press() {


		if (!isOn) {
			System.out.println("BIG OLD SWITCH PRESSED.\n\n");
			for (IDevice iDevice : myDevices) {
				iDevice.startDevice();;				
			}
			/*shutter.startDevice();
			airConditioning.setValue("20");
			lights.setValue("50");
			stereo.setValue("Bob Marley");
			coffeeMaker.setValue(CoffeeMaker.Type.DECAF.toString()); // fieser hack!*/
			isOn = true;
			System.out.println(CreateBulbMessage().toString());
		} else if (isOn) {
			/*shutter.stopDevice();
			airConditioning.stopDevice();
			lights.stopDevice();
			stereo.stopDevice();	
			coffeeMaker.stopDevice();*/
			for (IDevice iDevice : myDevices) {
				iDevice.stopDevice();				
			}
			
		}
	}

	private StringBuffer CreateBulbMessage() {
		StringBuffer b = new StringBuffer();
		b.append("         |\n");
		b.append(" \\     _____     /\n");
		b.append("     /       \\\n");
		b.append("    (         )\n");
		b.append("-   ( ))))))) )   -\n");
		b.append("     \\ \\   / /\n");
		b.append("      \\|___|/\n");
		b.append("  /    |___|    \\\n");
		b.append("       |___| prs\n");
		b.append("       |___|\n");
		return b;
	}

}
