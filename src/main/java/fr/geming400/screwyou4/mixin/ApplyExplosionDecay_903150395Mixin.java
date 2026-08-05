package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ApplyExplosionDecay.class)
public class ApplyExplosionDecay_903150395Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_2135231717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2135231717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1969595648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1969595648L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "explosionDecay()Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void explosionDecay_1601824118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1601824118L))
            info.setReturnValue(null);
    }


}
