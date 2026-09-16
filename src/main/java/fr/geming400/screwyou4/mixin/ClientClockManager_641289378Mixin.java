package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.ClientClockManager.class)
public class ClientClockManager_641289378Mixin {
        @Inject(at = @At("HEAD"), method = "tick(J)V", cancellable = true)
    private void tick_944386859(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(944386859L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTotalTicks(Lnet/minecraft/core/Holder;)J", cancellable = true)
    private void getTotalTicks__1787588705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1787588705L))
            info.setReturnValue(-2012278732675877929L);
    }

    @Inject(at = @At("HEAD"), method = "handleUpdates(JLjava/util/Map;)V", cancellable = true)
    private void handleUpdates__57452269(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-57452269L))
            info.cancel();
    }


}
