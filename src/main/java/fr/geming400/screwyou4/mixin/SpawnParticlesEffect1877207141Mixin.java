package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.SpawnParticlesEffect.class)
public class SpawnParticlesEffect1877207141Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1032247896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1032247896L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_741747166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(741747166L))
            info.setReturnValue("㎂z립ePp#8bk]m\"nE'aTꦣ&5Ⅺk꯷ꍛ){10І");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1915469883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1915469883L))
            info.setReturnValue(-63497040);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply__1177008384(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1177008384L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "horizontalVelocity()Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$VelocitySource;", cancellable = true)
    private void horizontalVelocity_849623594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(849623594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "verticalPosition()Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$PositionSource;", cancellable = true)
    private void verticalPosition__1220742306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1220742306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horizontalPosition()Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$PositionSource;", cancellable = true)
    private void horizontalPosition__1220742306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1220742306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "verticalVelocity()Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$VelocitySource;", cancellable = true)
    private void verticalVelocity_849623594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(849623594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__681906431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-681906431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "speed()Lnet/minecraft/util/valueproviders/FloatProvider;", cancellable = true)
    private void speed__1484540575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1484540575L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "particle()Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void particle__191753927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-191753927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inBoundingBox()Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$PositionSource;", cancellable = true)
    private static void inBoundingBox__1220742058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1220742058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixedVelocity(Lnet/minecraft/util/valueproviders/FloatProvider;)Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$VelocitySource;", cancellable = true)
    private static void fixedVelocity__205963533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-205963533L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "movementScaled(F)Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$VelocitySource;", cancellable = true)
    private static void movementScaled__1599816724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1599816724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offsetFromEntityPosition(F)Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$PositionSource;", cancellable = true)
    private static void offsetFromEntityPosition_624784672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(624784672L))
            info.setReturnValue(null);
    }


}
