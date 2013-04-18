package com.ar.beans;

import java.util.Random;

public class KeyGenerator {
	public int generateKey(int bitType) {
		Random r = new Random(bitType);
		return r.nextInt();
	}
}
