import home.automation.Main;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by Ferdinand.Szekeresch on 09.07.2017.
 */
public class GoldStandardTest {

    @Test
    public void testGoldStandard() {
        String goldStandard = "BIG OLD SWITCH PRESSED.\n\n\nClosing blinds.\nSetting temperature to 20\nDimming to 50%\nLoading Spotify....\nGet up, stand up... Stand up for your rights!\nTurning on CoffeeMaster3000(c)\nBRRRRRRRRRRRRRRRRRRRRRRR SHHHHHHHHHHHHHHHHHHHHHHHHHHHH Drip Drip Drip...\nUsing Decaf Beans.\n         |\n \\     _____     /\n     /       \\\n    (         )\n-   ( ))))))) )   -\n     \\ \\   / /\n      \\|___|/\n  /    |___|    \\\n       |___| prs\n       |___|\n\nOpening blinds. Avert your eyes.\nTurning off airconditioning.\nLights will go out in 10 seconds.\nPlay will continue from 'I didn't shoot the deputy.'\nStereo Shutting down.\nRunning MasterClean3000(c) on CoffeeMaster3000\nShutting down CoffeeMaster3000\nCoffeeMaster3000 standing by.";

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream testOut = new PrintStream(baos);
        PrintStream stdout = System.out;
        System.setOut(testOut);

        Main.main(new String[]{});
    
        var capturedOut = baos.toString();
        System.setOut(stdout);
        System.out.println(capturedOut);
        
        Assert.assertEquals(goldStandard.trim(), capturedOut.trim().replace("\r", ""));
    }
}
