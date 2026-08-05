package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.OminousBottleAmplifier.class)
public class OminousBottleAmplifier1373693919Mixin {
        @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value_1411956165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1411956165L))
            info.setReturnValue(118271563);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1535761118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1535761118L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_238233944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(238233944L))
            info.setReturnValue(";+\uCA6EnX?i(=A,\uBEA298-q4P(7n$S,Z:ki\u19DAZ99CGK0[D 9\u24ED\u4E29m\uAF2AD5f(T$%|\uD63D1tK{&drIQ\uB39308d");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1411956661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1411956661L))
            info.setReturnValue(-60251926);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1169024471(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1169024471L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onConsume(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/component/Consumable;)V", cancellable = true)
    private void onConsume__814549117(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-814549117L))
            info.cancel();
    }


}
