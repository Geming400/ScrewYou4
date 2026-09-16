package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.OminousBottleAmplifier.class)
public class OminousBottleAmplifier1373693919Mixin {
        @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value__930977036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-930977036L))
            info.setReturnValue(643438283);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_465067651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(465067651L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2144117444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2144117444L))
            info.setReturnValue("7\u19E9\u5ED6\u7916");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1931046010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1931046010L))
            info.setReturnValue(1227347756);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1001526128(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1001526128L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onConsume(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/component/Consumable;)V", cancellable = true)
    private void onConsume_1281596768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1281596768L))
            info.cancel();
    }


}
