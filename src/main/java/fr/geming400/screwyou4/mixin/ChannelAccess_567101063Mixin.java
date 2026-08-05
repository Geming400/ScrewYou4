package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.ChannelAccess.class)
public class ChannelAccess_567101063Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_605375801(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(605375801L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "scheduleTick()V", cancellable = true)
    private void scheduleTick_605375801(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(605375801L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "executeOnChannels(Ljava/util/function/Consumer;)V", cancellable = true)
    private void executeOnChannels_1248117475(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1248117475L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createHandle(Lcom/mojang/blaze3d/audio/Library$Pool;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void createHandle__514332971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-514332971L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
