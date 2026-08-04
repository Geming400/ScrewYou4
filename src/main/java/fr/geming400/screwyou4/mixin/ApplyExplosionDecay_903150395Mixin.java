package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ApplyExplosionDecay.class)
public class ApplyExplosionDecay_903150395Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_741802586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(741802586L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1655963178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1655963178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "explosionDecay()Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void explosionDecay__1209145327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1209145327L))
            info.setReturnValue(null);
    }


}
