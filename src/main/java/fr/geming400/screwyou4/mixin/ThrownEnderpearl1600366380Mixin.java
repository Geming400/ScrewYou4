package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.throwableitemprojectile.ThrownEnderpearl.class)
public class ThrownEnderpearl1600366380Mixin {
        @Inject(at = @At("HEAD"), method = "getOwner()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getOwner_2045819669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2045819669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1470682722(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1470682722L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onInsideBubbleColumn(Z)V", cancellable = true)
    private void onInsideBubbleColumn_1102739846(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1102739846L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canTeleport(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void canTeleport_486743880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(486743880L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onAboveBubbleColumn(ZLnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void onAboveBubbleColumn__147019575(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-147019575L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teleport(Lnet/minecraft/world/level/portal/TeleportTransition;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void teleport_612117133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(612117133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onRemoval(Lnet/minecraft/world/entity/Entity$RemovalReason;)V", cancellable = true)
    private void onRemoval__2110180231(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2110180231L))
            info.cancel();
    }


}
