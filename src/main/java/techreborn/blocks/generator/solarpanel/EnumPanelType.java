package techreborn.blocks.generator.solarpanel;

import net.minecraft.util.IStringSerializable;
import reborncore.api.power.EnumPowerTier;

public enum EnumPanelType implements IStringSerializable {
	Basic("basic", 128, 1000, 256, 50000, EnumPowerTier.LOW, 0),
	Hybrid("hybrid", 32, 2000, 2084, 100000, EnumPowerTier.MEDIUM, 1),
	Advanced("advanced", 512, 3000, 4092, 200000, EnumPowerTier.MEDIUM, 2),
	Ultimate("ultimate", 2048, 4000, 6084, 300000,  EnumPowerTier.HIGH, 3),
	Quantum("quantum", 4048, 5000, 8042, 400000, EnumPowerTier.EXTREME, 4);

	private int ID;
	private String friendlyName;

	public int generationRateD = 128;
	// Generation of FE during Day

	public int generationRateN = 64;
	// Generation of FE during Night

	public int outputRate = 0;
	// Output rate of energy

	public int internalCapacity = 0;
	// Internal FE storage of solar panel


	EnumPanelType(String friendlyName, int generationRateD, int generationRateN, int outputRate, int internalCapacity,  EnumPowerTier tier, int ID) {
		this.friendlyName = friendlyName;
		this.ID = ID;
		this.generationRateD = generationRateD;
		this.generationRateN = generationRateN;
		this.internalCapacity = internalCapacity;
		this.outputRate = outputRate;
	}



	@Override
	public String getName() {
		return friendlyName;
	}


	public int getID(){
		return ID;
	}
}
