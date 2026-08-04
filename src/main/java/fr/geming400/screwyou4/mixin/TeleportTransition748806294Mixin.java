package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.portal.TeleportTransition.class)
public class TeleportTransition748806294Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2134318553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2134318553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__386653681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-386653681L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_787069036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(787069036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void position_1846535823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846535823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newLevel()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void newLevel_1416344294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1416344294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDefault(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/portal/TeleportTransition$PostTeleportTransition;)Lnet/minecraft/world/level/portal/TeleportTransition;", cancellable = true)
    private static void createDefault__1385217875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1385217875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "xRot()F", cancellable = true)
    private void xRot_787065657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(787065657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yRot()F", cancellable = true)
    private void yRot_787065657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(787065657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "postTeleportTransition()Lnet/minecraft/world/level/portal/TeleportTransition$PostTeleportTransition;", cancellable = true)
    private void postTeleportTransition_412842951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(412842951L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withPosition(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/level/portal/TeleportTransition;", cancellable = true)
    private void withPosition__823271041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-823271041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withRotation(FF)Lnet/minecraft/world/level/portal/TeleportTransition;", cancellable = true)
    private void withRotation__1732591565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1732591565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transitionAsPassenger()Lnet/minecraft/world/level/portal/TeleportTransition;", cancellable = true)
    private void transitionAsPassenger_203776371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(203776371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asPassenger()Z", cancellable = true)
    private void asPassenger_787084877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(787084877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relatives()Ljava/util/Set;", cancellable = true)
    private void relatives__1080229192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1080229192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deltaMovement()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void deltaMovement_1846535823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846535823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "missingRespawnBlock()Z", cancellable = true)
    private void missingRespawnBlock_787084877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(787084877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "missingRespawnBlock(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/portal/TeleportTransition$PostTeleportTransition;)Lnet/minecraft/world/level/portal/TeleportTransition;", cancellable = true)
    private static void missingRespawnBlock__1385217875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1385217875L))
            info.setReturnValue(null);
    }


}
