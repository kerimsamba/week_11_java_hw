import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPilot {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Biggles", Rank.Captain, "FE207");
    }

    @Test
    public void testPilotHasName(){
        assertEquals("Biggles", pilot.getName());
    }

    @Test
    public void testPilotHasRank(){
        assertEquals(Rank.Captain, pilot.getRank());
    }

    @Test
    public void testPilotHasLicense() {
        assertEquals("FE207", pilot.getLicense());
    }

    @Test
    public void testPilotCanRelayMessage() {
        assertEquals("This is Biggles, your Captain speaking - up, up and away!", pilot.flyPlane(pilot));
    }
}
