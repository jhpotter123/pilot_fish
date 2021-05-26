package com.example.demo.xml;

/**
 * Enumeration created for the Fish type.  Note the specification 
 * doesn't call to write this to the database but I think this 
 * might have been an error.  I wanted to stick to the speification 
 * but make the code extendable later and cliearly document where 
 * it would be added.  See FishService.
 *    
 * @author jeff
 */
public enum FishType {
    Shark("Shark"),
    Ray("Ray"),
    Eel("Eel"),
    Herring("Herring"),
    SalmonTroutPike("Salmon/Trout/Pike"),
    Carp("Carp"),
    Catfish("Catfish"),
    LanternFish("Lantern Fish"),
    Cod("Cod"),
    FlyingFish("Flying Fish"),
    SquirrelFish("Squirrel Fish"),
    PipefishSeahorse("Pipefish/Seahorse"),
    Stonefish("Stonefish"),
    FlatFish("Flat Fish"),
    Puffer("Puffer"),
    Perciforms("Perciforms");

	public final String value;

	private FishType(String value) {
	    this.value = value;
	}

	public String getValue() {
		return value;
	}
}
