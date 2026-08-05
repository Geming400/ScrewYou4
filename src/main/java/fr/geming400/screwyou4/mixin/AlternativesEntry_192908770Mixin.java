package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.entries.AlternativesEntry.class)
public class AlternativesEntry_192908770Mixin {
        @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__825810002(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-825810002L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1259354023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1259354023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alternatives([Lnet/minecraft/world/level/storage/loot/entries/LootPoolEntryContainer$Builder;)Lnet/minecraft/world/level/storage/loot/entries/AlternativesEntry$Builder;", cancellable = true)
    private static void alternatives__1615352076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1615352076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alternatives(Ljava/util/Collection;Ljava/util/function/Function;)Lnet/minecraft/world/level/storage/loot/entries/AlternativesEntry$Builder;", cancellable = true)
    private static void alternatives__288835203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-288835203L))
            info.setReturnValue(null);
    }


}
