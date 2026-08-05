package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.FlowerBlock.class)
public class FlowerBlock_1133518044Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2095003999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2095003999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSuspiciousEffects()Lnet/minecraft/world/item/component/SuspiciousStewEffects;", cancellable = true)
    private void getSuspiciousEffects_1709185731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1709185731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBeeInteractionEffect()Lnet/minecraft/world/effect/MobEffectInstance;", cancellable = true)
    private void getBeeInteractionEffect_306776071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(306776071L))
            info.setReturnValue(null);
    }


}
