package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.entries.SequentialEntry.class)
public class SequentialEntry1042521893Mixin {
        @Inject(at = @At("HEAD"), method = "sequential([Lnet/minecraft/world/level/storage/loot/entries/LootPoolEntryContainer$Builder;)Lnet/minecraft/world/level/storage/loot/entries/SequentialEntry$Builder;", cancellable = true)
    private static void sequential__490781525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-490781525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1516591679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1516591679L))
            info.setReturnValue(null);
    }


}
