package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.FlowerBlock.class)
public class FlowerBlock_1133518044Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1425595529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1425595529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSuspiciousEffects()Lnet/minecraft/world/item/component/SuspiciousStewEffects;", cancellable = true)
    private void getSuspiciousEffects__196556588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-196556588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBeeInteractionEffect()Lnet/minecraft/world/effect/MobEffectInstance;", cancellable = true)
    private void getBeeInteractionEffect__616334992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-616334992L))
            info.setReturnValue(null);
    }


}
