package uk.faykent.cbgirl.init;

import uk.faykent.cbgirl.block.PackageOfSkullsBlock;
import uk.faykent.cbgirl.block.PackageOfPrideV1Block;
import uk.faykent.cbgirl.block.PackageOfClassicoBlock;
import uk.faykent.cbgirl.block.PackageOfCammiesPinkBlock;
import uk.faykent.cbgirl.block.PackageOfCammiesBlueBlock;
import uk.faykent.cbgirl.block.PackageOfBioMassBlock;
import uk.faykent.cbgirl.CbgirlMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

public class CbgirlModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CbgirlMod.MODID);
	public static final DeferredBlock<Block> PACKAGE_OF_CAMMIES_PINK = REGISTRY.register("package_of_cammies_pink", PackageOfCammiesPinkBlock::new);
	public static final DeferredBlock<Block> PACKAGE_OF_CAMMIES_BLUE = REGISTRY.register("package_of_cammies_blue", PackageOfCammiesBlueBlock::new);
	public static final DeferredBlock<Block> PACKAGE_OF_SKULLS = REGISTRY.register("package_of_skulls", PackageOfSkullsBlock::new);
	public static final DeferredBlock<Block> PACKAGE_OF_PRIDE_V_1 = REGISTRY.register("package_of_pride_v_1", PackageOfPrideV1Block::new);
	public static final DeferredBlock<Block> PACKAGE_OF_BIO_MASS = REGISTRY.register("package_of_bio_mass", PackageOfBioMassBlock::new);
	public static final DeferredBlock<Block> PACKAGE_OF_CLASSICO = REGISTRY.register("package_of_classico", PackageOfClassicoBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}