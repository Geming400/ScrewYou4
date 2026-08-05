package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.ClientClockManager.class)
public class ClientClockManager_641289378Mixin {
        @Inject(at = @At("HEAD"), method = "tick(J)V", cancellable = true)
    private void tick_1856129870(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1856129870L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleUpdates(JLjava/util/Map;)V", cancellable = true)
    private void handleUpdates_2004664661(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2004664661L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTotalTicks(Lnet/minecraft/core/Holder;)J", cancellable = true)
    private void getTotalTicks__2107214313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2107214313L))
            info.setReturnValue(4046169002518779287L);
    }


}
