package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.PortalProcessor.class)
public class PortalProcessor_1656442440Mixin {
        @Inject(at = @At("HEAD"), method = "isInsidePortalThisTick()Z", cancellable = true)
    private void isInsidePortalThisTick_493148881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(493148881L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isSamePortal(Lnet/minecraft/world/level/block/Portal;)Z", cancellable = true)
    private void isSamePortal_96133895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(96133895L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "processPortalTeleportation(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Z)Z", cancellable = true)
    private void processPortalTeleportation__2070144559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2070144559L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPortalDestination(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/level/portal/TeleportTransition;", cancellable = true)
    private void getPortalDestination__916435752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-916435752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateEntryPosition(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void updateEntryPosition__966764608(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-966764608L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAsInsidePortalThisTick(Z)V", cancellable = true)
    private void setAsInsidePortalThisTick__1072744677(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1072744677L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasExpired()Z", cancellable = true)
    private void hasExpired__99337293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-99337293L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getEntryPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getEntryPosition__2115753885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2115753885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPortalTime()I", cancellable = true)
    private void getPortalTime_691645502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(691645502L))
            info.setReturnValue(1197742523);
    }

    @Inject(at = @At("HEAD"), method = "getPortalLocalTransition()Lnet/minecraft/world/level/block/Portal$Transition;", cancellable = true)
    private void getPortalLocalTransition__1844461378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1844461378L))
            info.setReturnValue(net.minecraft.world.level.block.Portal.Transition.CONFUSION);
    }


}
