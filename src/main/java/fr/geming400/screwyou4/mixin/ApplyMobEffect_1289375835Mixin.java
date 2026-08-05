package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.ApplyMobEffect.class)
public class ApplyMobEffect_1289375835Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1620079203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1620079203L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_153915859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153915859L))
            info.setReturnValue("L\u106D|,OOJT.\u172FVJbLPFL>V}+]O$\u30C84A$+\uC4D3\u5D19J.I\uBF6A*;;\u0A69Y2|T/:vVc9hr?0&$Sg_'V%Vn@5h\u0F21\u0128#9\u6327g51MD,/\uD634\u15D8q_D?kXz,/;232)[");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1327638576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1327638576L))
            info.setReturnValue(-795077823);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply__1764839691(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1764839691L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1269737738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1269737738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toApply()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void toApply__1385638418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1385638418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minAmplifier()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void minAmplifier_1421455433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1421455433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxAmplifier()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void maxAmplifier_1421455433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1421455433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minDuration()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void minDuration_1421455433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1421455433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxDuration()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void maxDuration_1421455433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1421455433L))
            info.setReturnValue(null);
    }


}
