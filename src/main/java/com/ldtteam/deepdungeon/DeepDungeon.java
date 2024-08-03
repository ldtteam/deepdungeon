package com.ldtteam.deepdungeon;

import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;

@Mod("deepdungeon")
public class DeepDungeon
{
    public DeepDungeon()
    {
        NeoForge.EVENT_BUS.register(this.getClass());
    }
}
