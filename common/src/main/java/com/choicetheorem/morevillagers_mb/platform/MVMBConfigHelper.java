package com.choicetheorem.morevillagers_mb.platform;

import dev.architectury.injectables.annotations.ExpectPlatform;

public class MVMBConfigHelper {
	@ExpectPlatform
	public static int minerHouseWeight() {
		throw new AssertionError();
	}
	@ExpectPlatform
	public static int netherologistHouseWeight(){
		throw new AssertionError();
	}
}