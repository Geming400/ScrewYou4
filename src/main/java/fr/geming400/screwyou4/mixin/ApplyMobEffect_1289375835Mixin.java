package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.ApplyMobEffect.class)
public class ApplyMobEffect_1289375835Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_380749566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(380749566L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2059799359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2059799359L))
            info.setReturnValue("eo=/\u445CW9dImdf9RCq`3i\u9761rjFd\uD3FF3y&%'wTeulu{e2Z\uD57Fr\u7845,Gd6LxUA`\u80E4WG\uF96A\uCAD9H?UMKQ5_x7#B\u026EzW\uA126P>cmEL9;+\u65C9,0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1846727925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846727925L))
            info.setReturnValue(-811974008);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply_964181831(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(964181831L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1939146208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939146208L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toApply()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void toApply_166068961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(166068961L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxAmplifier()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void maxAmplifier__398918794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-398918794L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxDuration()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void maxDuration_450221409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(450221409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minAmplifier()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void minAmplifier_1450810312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1450810312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minDuration()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void minDuration_1756816079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1756816079L))
            info.setReturnValue(null);
    }


}
