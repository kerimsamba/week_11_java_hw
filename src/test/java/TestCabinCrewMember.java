import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCabinCrewMember {

    private CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Brian", Rank.FlightAttendant);
    }


    @Test
    public void CabinCrewMemberHasName() {
        assertEquals("Brian", cabinCrewMember.getName());
    }

    @Test
    public void CabinCrewMemberHasRank() {
        assertEquals(Rank.FlightAttendant, cabinCrewMember.getRank());
    }

    @Test
    public void CabinCrewCanRelayMessage() {
        assertEquals("This is Brian, your FlightAttendant, please fasten your seat belts", cabinCrewMember.relayMessage(cabinCrewMember));
    }
}





