package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetOminousBottleAmplifierFunction.class)
public class SetOminousBottleAmplifierFunction1652193165Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run__1410692808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1410692808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_633474394(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(633474394L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1576328877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1576328877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAmplifier(Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void setAmplifier_574599776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(574599776L))
            info.setReturnValue(null);
    }


}
