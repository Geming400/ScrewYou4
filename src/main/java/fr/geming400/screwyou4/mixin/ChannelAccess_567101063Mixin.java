package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.ChannelAccess.class)
public class ChannelAccess_567101063Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear__218726644(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-218726644L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "scheduleTick()V", cancellable = true)
    private void scheduleTick__2018247451(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2018247451L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "executeOnChannels(Ljava/util/function/Consumer;)V", cancellable = true)
    private void executeOnChannels_167953927(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(167953927L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createHandle(Lcom/mojang/blaze3d/audio/Library$Pool;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void createHandle__1630082543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1630082543L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
