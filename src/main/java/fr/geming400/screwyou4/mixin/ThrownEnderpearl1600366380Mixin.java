package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.throwableitemprojectile.ThrownEnderpearl.class)
public class ThrownEnderpearl1600366380Mixin {
        @Inject(at = @At("HEAD"), method = "getOwner()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getOwner__865712462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-865712462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1638641119(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1638641119L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onRemoval(Lnet/minecraft/world/entity/Entity$RemovalReason;)V", cancellable = true)
    private void onRemoval__1419540692(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1419540692L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teleport(Lnet/minecraft/world/level/portal/TeleportTransition;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void teleport_1166485986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1166485986L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canTeleport(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void canTeleport_1079015107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1079015107L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onInsideBubbleColumn(Z)V", cancellable = true)
    private void onInsideBubbleColumn__1464984087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1464984087L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onAboveBubbleColumn(ZLnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void onAboveBubbleColumn_1803884521(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1803884521L))
            info.cancel();
    }


}
