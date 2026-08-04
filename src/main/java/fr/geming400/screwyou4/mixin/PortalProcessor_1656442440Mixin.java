package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.PortalProcessor.class)
public class PortalProcessor_1656442440Mixin {
        @Inject(at = @At("HEAD"), method = "getEntryPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getEntryPosition__236944440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-236944440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPortalTime()I", cancellable = true)
    private void getPortalTime_1694704685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1694704685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPortalLocalTransition()Lnet/minecraft/world/level/block/Portal$Transition;", cancellable = true)
    private void getPortalLocalTransition__190222884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-190222884L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isInsidePortalThisTick()Z", cancellable = true)
    private void isInsidePortalThisTick_1694721022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1694721022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAsInsidePortalThisTick(Z)V", cancellable = true)
    private void setAsInsidePortalThisTick__1408908028(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1408908028L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPortalDestination(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/level/portal/TeleportTransition;", cancellable = true)
    private void getPortalDestination__582950004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-582950004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSamePortal(Lnet/minecraft/world/level/block/Portal;)Z", cancellable = true)
    private void isSamePortal__326213949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-326213949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateEntryPosition(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void updateEntryPosition_1825209038(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1825209038L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "processPortalTeleportation(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Z)Z", cancellable = true)
    private void processPortalTeleportation_1125050528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1125050528L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasExpired()Z", cancellable = true)
    private void hasExpired_1694721022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1694721022L))
            info.setReturnValue(null);
    }


}
