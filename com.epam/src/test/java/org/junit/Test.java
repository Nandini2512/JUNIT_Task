package org.junit;
import static org.junit.Assert.*;

import org.junit.Test;
public class Test extends Abcd {
	Abcd aa=new Abcd();
	public void Test() {
		assertEquals(aa.To_Remove_A("ABCD"),"BCD");
		assertEquals(aa.To_Remove_A("AACD"),"CD");
		assertEquals(aa.To_Remove_A("BACD"),"BCD");
		assertEquals(aa.To_Remove_A("BBAA"),"BBAA");
	    assertEquals(aa.To_Remove_A("AABAA"),"BAA");
	}
}

