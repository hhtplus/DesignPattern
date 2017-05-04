package com.hanlinonline.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hanlinonlne.singleton.Singleton;

public class SingletonTest {

	@Test
	public void testGetInstance() {
		assertNotNull(Singleton.getInstance());
	}
}
