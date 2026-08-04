package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.SculkCatalystBlockEntity.CatalystListener.class)
public class CatalystListener_1767964488Mixin {
        @Inject(at = @At("HEAD"), method = "handleGameEvent(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/Holder;Lnet/minecraft/world/level/gameevent/GameEvent$Context;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void handleGameEvent_733348577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(733348577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSculkSpreader()Lnet/minecraft/world/level/block/SculkSpreader;", cancellable = true)
    private void getSculkSpreader_1382007493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1382007493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDeliveryMode()Lnet/minecraft/world/level/gameevent/GameEventListener$DeliveryMode;", cancellable = true)
    private void getDeliveryMode__1827011757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1827011757L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getListenerSource()Lnet/minecraft/world/level/gameevent/PositionSource;", cancellable = true)
    private void getListenerSource__1856145554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1856145554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getListenerRadius()I", cancellable = true)
    private void getListenerRadius_1806226733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1806226733L))
            info.setReturnValue(null);
    }


}
