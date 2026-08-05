package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.ApplyEntityImpulse.class)
public class ApplyEntityImpulse1307095366Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1602359671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1602359671L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_171635391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(171635391L))
            info.setReturnValue("3/(:4}Ja}y)iR;,-O-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1345358108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1345358108L))
            info.setReturnValue(371854470);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply__1747120159(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1747120159L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "magnitude()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void magnitude_1439174965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1439174965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "direction()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void direction__1890142401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1890142401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "coordinateScale()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void coordinateScale__1890142401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1890142401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1252018206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1252018206L))
            info.setReturnValue(null);
    }


}
