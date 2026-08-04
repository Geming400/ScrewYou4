package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.entries.AlternativesEntry.class)
public class AlternativesEntry_192908770Mixin {
        @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_1769539460(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1769539460L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1928762493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1928762493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alternatives([Lnet/minecraft/world/level/storage/loot/entries/LootPoolEntryContainer$Builder;)Lnet/minecraft/world/level/storage/loot/entries/AlternativesEntry$Builder;", cancellable = true)
    private static void alternatives__2137458930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2137458930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alternatives(Ljava/util/Collection;Ljava/util/function/Function;)Lnet/minecraft/world/level/storage/loot/entries/AlternativesEntry$Builder;", cancellable = true)
    private static void alternatives_65952547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(65952547L))
            info.setReturnValue(null);
    }


}
