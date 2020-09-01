package com.bs23.mbss.items;

import com.bs23.mbss.MagicBobsSorceryStuff;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase  extends Item {

    public ItemBase() {
        super(new Item.Properties().group(MagicBobsSorceryStuff.TAB));
    }
}
