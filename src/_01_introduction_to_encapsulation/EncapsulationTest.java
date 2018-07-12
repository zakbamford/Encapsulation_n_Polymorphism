package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class EncapsulationTest {
	@Test
	public void test() {
		EncapsulateTheData e = new EncapsulateTheData();
		e.setItemsReceived(-3);
		e.setDegreesTurned(400);
		e.setNomenclature("");
		e.setMemberObj("hello");
		assertTrue(e.getItemsReceived() >= 0);
		assertFalse(e.getDegreesTurned() == 400);
		assertFalse(e.getNomenclature().equals(""));
		assertFalse(e.getMemberObj() instanceof String);
	}
}
