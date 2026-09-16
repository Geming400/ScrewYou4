package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect.class)
public class ApplyStatusEffectsConsumeEffect1032151245Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_123524977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(123524977L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1802574770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1802574770L))
            info.setReturnValue("U`[cm#\uBC50DI1k>Ea}hvfKguos(?U#s\u7BE9;:e*6zjMQG+fJNVq,+}/%\uC789fW");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1589503336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589503336L))
            info.setReturnValue(-1359426428);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void apply__758895374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-758895374L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/item/consume_effects/ConsumeEffect$Type;", cancellable = true)
    private void getType_340748981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340748981L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "effects()Ljava/util/List;", cancellable = true)
    private void effects_1583428351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1583428351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "probability()F", cancellable = true)
    private void probability_1000959067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1000959067L))
            info.setReturnValue(5.527477E8F);
    }


}
