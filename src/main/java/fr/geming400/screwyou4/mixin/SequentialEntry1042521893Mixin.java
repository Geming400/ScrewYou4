package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.entries.SequentialEntry.class)
public class SequentialEntry1042521893Mixin {
        @Inject(at = @At("HEAD"), method = "sequential([Lnet/minecraft/world/level/storage/loot/entries/LootPoolEntryContainer$Builder;)Lnet/minecraft/world/level/storage/loot/entries/SequentialEntry$Builder;", cancellable = true)
    private static void sequential__172601046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-172601046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2108967147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2108967147L))
            info.setReturnValue(null);
    }


}
