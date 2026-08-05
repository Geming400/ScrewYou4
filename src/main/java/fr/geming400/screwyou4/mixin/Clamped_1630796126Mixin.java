package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.LevelBasedValue.Clamped.class)
public class Clamped_1630796126Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void value_1762875724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1762875724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1278658912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1278658912L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_495336150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(495336150L))
            info.setReturnValue("ZonHaT)$An[|LK\uD68AEW(Bco\u8D25BSLRq\uA05D\uCC26l`%-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1669058867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1669058867L))
            info.setReturnValue(934290905);
    }

    @Inject(at = @At("HEAD"), method = "min()F", cancellable = true)
    private void min_1669055488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1669055488L))
            info.setReturnValue(2.458916E8F);
    }

    @Inject(at = @At("HEAD"), method = "max()F", cancellable = true)
    private void max_1669055488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1669055488L))
            info.setReturnValue(2.468906E8F);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__928317447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-928317447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculate(I)F", cancellable = true)
    private void calculate__1450269575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450269575L))
            info.setReturnValue(2.468906E8F);
    }


}
