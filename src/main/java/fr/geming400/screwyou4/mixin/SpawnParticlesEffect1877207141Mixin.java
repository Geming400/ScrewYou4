package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.SpawnParticlesEffect.class)
public class SpawnParticlesEffect1877207141Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_968580873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(968580873L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1647336630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1647336630L))
            info.setReturnValue("\u6411lR-y8d[\u0D2EXhwt!\u5014s8e<Uj8Qp=b\u9E6Cw,\uCDDE&?}@P6\u5B3BVf\uC157&<\u8C26ip\u31E1Cl\u2297\uFF74\u4817\uCC05:\u67E3?Z'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1860408064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1860408064L))
            info.setReturnValue(444943507);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply_1552013138(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1552013138L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "speed()Lnet/minecraft/util/valueproviders/FloatProvider;", cancellable = true)
    private void speed_1648022394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1648022394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1351314901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1351314901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "particle()Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void particle_1846055487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846055487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "verticalVelocity()Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$VelocitySource;", cancellable = true)
    private void verticalVelocity__51336099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-51336099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inBoundingBox()Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$PositionSource;", cancellable = true)
    private static void inBoundingBox__924660232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-924660232L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horizontalPosition()Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$PositionSource;", cancellable = true)
    private void horizontalPosition__2076987125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2076987125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "verticalPosition()Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$PositionSource;", cancellable = true)
    private void verticalPosition__63840035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-63840035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "movementScaled(F)Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$VelocitySource;", cancellable = true)
    private static void movementScaled__766615581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-766615581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horizontalVelocity()Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$VelocitySource;", cancellable = true)
    private void horizontalVelocity__2064483189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2064483189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offsetFromEntityPosition(F)Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$PositionSource;", cancellable = true)
    private static void offsetFromEntityPosition__751709033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-751709033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixedVelocity(Lnet/minecraft/util/valueproviders/FloatProvider;)Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$VelocitySource;", cancellable = true)
    private static void fixedVelocity__1943615134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1943615134L))
            info.setReturnValue(null);
    }


}
