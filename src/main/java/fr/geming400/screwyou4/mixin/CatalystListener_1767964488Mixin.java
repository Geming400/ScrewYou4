package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.SculkCatalystBlockEntity.CatalystListener.class)
public class CatalystListener_1767964488Mixin {
        @Inject(at = @At("HEAD"), method = "handleGameEvent(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/Holder;Lnet/minecraft/world/level/gameevent/GameEvent$Context;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void handleGameEvent__1498079391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1498079391L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getListenerSource()Lnet/minecraft/world/level/gameevent/PositionSource;", cancellable = true)
    private void getListenerSource__1060105389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1060105389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDeliveryMode()Lnet/minecraft/world/level/gameevent/GameEventListener$DeliveryMode;", cancellable = true)
    private void getDeliveryMode__1638604672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1638604672L))
            info.setReturnValue(net.minecraft.world.level.gameevent.GameEventListener.DeliveryMode.UNSPECIFIED);
    }

    @Inject(at = @At("HEAD"), method = "getListenerRadius()I", cancellable = true)
    private void getListenerRadius_1514404689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514404689L))
            info.setReturnValue(-940623197);
    }

    @Inject(at = @At("HEAD"), method = "getSculkSpreader()Lnet/minecraft/world/level/block/SculkSpreader;", cancellable = true)
    private void getSculkSpreader_1002668503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1002668503L))
            info.setReturnValue(null);
    }


}
