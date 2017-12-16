package pkgTest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import pkgCore.Die;

public class DieTest {

	@Test
	public void TestDie() {

		for (int a = 0; a < 100 ; a++) {
			Die d = new Die();
			System.out.println(d.getDieValue());
			Assert.assertTrue(d.getDieValue() <= 6 && d.getDieValue() >= 1);
		}

	}

}
