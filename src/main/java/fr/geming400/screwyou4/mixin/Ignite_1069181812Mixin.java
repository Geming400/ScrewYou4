package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.Ignite.class)
public class Ignite_1069181812Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_160555543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(160555543L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1839605336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1839605336L))
            info.setReturnValue("e,9^$K\uA5F8+)PAdUB\u723BVf]7'\uB4D8;|,YL*rgRW\u6FA5t-LXxi");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1626533902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1626533902L))
            info.setReturnValue(-878996);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply_743987808(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(743987808L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "duration()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void duration_1267611638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1267611638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2135627065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2135627065L))
            info.setReturnValue(null);
    }


}
