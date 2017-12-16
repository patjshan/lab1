package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import pkgCore.Die;
import pkgCore.Roll;

public class RollTest {

	@Test
	public void TestRoll() {

		for (int a = 0; a < 10000; a++) {
			Roll r = new Roll();
			Assert.assertTrue(r.getScore() <= 12 && r.getScore() >=1);
		}

	}

}
