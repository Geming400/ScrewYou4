package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.portal.TeleportTransition.class)
public class TeleportTransition748806294Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__159819974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-159819974L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1519229819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1519229819L))
            info.setReturnValue("@cJ9'\u37BF{Ih4Ra\uB01C \u30F2nnb\u78105<\u5E6F]u:us\uC0FDIe");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1306158385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1306158385L))
            info.setReturnValue(-914761986);
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void position_1326363846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1326363846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newLevel()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void newLevel_995304106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(995304106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yRot()F", cancellable = true)
    private void yRot_1059609435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1059609435L))
            info.setReturnValue(9.374469E8F);
    }

    @Inject(at = @At("HEAD"), method = "xRot()F", cancellable = true)
    private void xRot__1427903398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1427903398L))
            info.setReturnValue(9.374469E8F);
    }

    @Inject(at = @At("HEAD"), method = "deltaMovement()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void deltaMovement__113526616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-113526616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withRotation(FF)Lnet/minecraft/world/level/portal/TeleportTransition;", cancellable = true)
    private void withRotation__1860799665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1860799665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transitionAsPassenger()Lnet/minecraft/world/level/portal/TeleportTransition;", cancellable = true)
    private void transitionAsPassenger__1252216608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1252216608L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "postTeleportTransition()Lnet/minecraft/world/level/portal/TeleportTransition$PostTeleportTransition;", cancellable = true)
    private void postTeleportTransition_2104373095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2104373095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asPassenger()Z", cancellable = true)
    private void asPassenger__728364347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-728364347L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "withPosition(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/level/portal/TeleportTransition;", cancellable = true)
    private void withPosition_1139602574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1139602574L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "missingRespawnBlock()Z", cancellable = true)
    private void missingRespawnBlock_656035938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(656035938L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "missingRespawnBlock(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/portal/TeleportTransition$PostTeleportTransition;)Lnet/minecraft/world/level/portal/TeleportTransition;", cancellable = true)
    private static void missingRespawnBlock_1591071288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1591071288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDefault(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/portal/TeleportTransition$PostTeleportTransition;)Lnet/minecraft/world/level/portal/TeleportTransition;", cancellable = true)
    private static void createDefault__324677230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-324677230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relatives()Ljava/util/Set;", cancellable = true)
    private void relatives_510061617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(510061617L))
            info.setReturnValue(null);
    }


}
