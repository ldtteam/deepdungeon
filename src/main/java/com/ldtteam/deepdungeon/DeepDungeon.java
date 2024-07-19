package com.ldtteam.deepdungeon;

import net.minecraftforge.fml.common.Mod;

@Mod("deepdungeon")
public class DeepDungeon
{
    public DeepDungeon()
    {
        Mod.EventBusSubscriber.Bus.FORGE.bus().get().register(this.getClass());
    }
}
