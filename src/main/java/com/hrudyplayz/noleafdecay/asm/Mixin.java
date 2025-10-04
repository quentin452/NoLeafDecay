package com.hrudyplayz.noleafdecay.asm;

import java.util.List;
import java.util.function.Predicate;

import com.falsepattern.lib.mixin.IMixin;
import com.falsepattern.lib.mixin.ITargetedMod;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Mixin implements IMixin {

    common_core_MixinBlockLeaves(Side.COMMON, m -> true, "core.MixinBlockLeaves"),
    ;

    @Getter
    public final Side side;
    @Getter
    public final Predicate<List<ITargetedMod>> filter;
    @Getter
    public final String mixin;

    static Predicate<List<ITargetedMod>> require(TargetedMod in) {
        return modList -> modList.contains(in);
    }

    static Predicate<List<ITargetedMod>> avoid(TargetedMod in) {
        return modList -> !modList.contains(in);
    }
}
