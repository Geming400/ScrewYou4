package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.ApplyEntityImpulse.class)
public class ApplyEntityImpulse1307095366Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_398469098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(398469098L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2077518891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2077518891L))
            info.setReturnValue("n@U\u32ABm\"!q`B\u1CD2\u9645N}NmC$N%fTo+3VXLJN1j2\u74DC).Nmr#RoZ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1864447457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1864447457L))
            info.setReturnValue(-1348235734);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply_981901363(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(981901363L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "magnitude()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void magnitude__201019579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-201019579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "direction()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void direction__1432467616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1432467616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1921426676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1921426676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "coordinateScale()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void coordinateScale__2062689459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2062689459L))
            info.setReturnValue(null);
    }


}
