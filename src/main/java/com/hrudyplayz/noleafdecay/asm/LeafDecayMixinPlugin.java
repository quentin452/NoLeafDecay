package com.hrudyplayz.noleafdecay.asm;

import org.apache.logging.log4j.Logger;

import com.falsepattern.lib.config.ConfigException;
import com.falsepattern.lib.config.ConfigurationManager;
import com.falsepattern.lib.mixin.IMixin;
import com.falsepattern.lib.mixin.IMixinPlugin;
import com.falsepattern.lib.mixin.ITargetedMod;
import lombok.Getter;

public class LeafDecayMixinPlugin implements IMixinPlugin {

    @Getter
    private final Logger logger = IMixinPlugin.createLogger("LeafDecay");

    public LeafDecayMixinPlugin() { }

    @Override
    public ITargetedMod[] getTargetedModEnumValues() {
        return TargetedMod.values();
    }

    @Override
    public IMixin[] getMixinEnumValues() {
        return Mixin.values();
    }
}
