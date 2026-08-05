package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetStewEffectFunction.class)
public class SetStewEffectFunction_1110101232Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run__1952784742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1952784742L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_91382460(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(91382460L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stewEffect()Lnet/minecraft/world/level/storage/loot/functions/SetStewEffectFunction$Builder;", cancellable = true)
    private static void stewEffect__60961905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-60961905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2118420811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2118420811L))
            info.setReturnValue(null);
    }


}
