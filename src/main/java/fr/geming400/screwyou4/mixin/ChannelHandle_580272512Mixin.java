package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.ChannelAccess.ChannelHandle.class)
public class ChannelHandle_580272512Mixin {
        @Inject(at = @At("HEAD"), method = "execute(Ljava/util/function/Consumer;)V", cancellable = true)
    private void execute__929523695(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-929523695L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "release()V", cancellable = true)
    private void release__1438118773(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1438118773L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isStopped()Z", cancellable = true)
    private void isStopped__1447964717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1447964717L))
            info.setReturnValue(true);
    }


}
