package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.entries.EntryGroup.class)
public class EntryGroup_1029876623Mixin {
        @Inject(at = @At("HEAD"), method = "list([Lnet/minecraft/world/level/storage/loot/entries/LootPoolEntryContainer$Builder;)Lnet/minecraft/world/level/storage/loot/entries/EntryGroup$Builder;", cancellable = true)
    private static void list__1112996036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1112996036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1529236950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1529236950L))
            info.setReturnValue(null);
    }


}
