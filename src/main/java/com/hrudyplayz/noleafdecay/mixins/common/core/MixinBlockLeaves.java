package com.hrudyplayz.noleafdecay.mixins.common.core;

import net.minecraft.block.BlockLeaves;
import net.minecraft.world.World;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(BlockLeaves.class)
public class MixinBlockLeaves {

    @Overwrite
	public void updateTick(World worldIn, int x, int y, int z, Random random) {}
}
