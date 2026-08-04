package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.ChannelAccess.ChannelHandle.class)
public class ChannelHandle_580272512Mixin {
        @Inject(at = @At("HEAD"), method = "execute(Ljava/util/function/Consumer;)V", cancellable = true)
    private void execute_1261288924(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1261288924L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "release()V", cancellable = true)
    private void release_618547250(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(618547250L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isStopped()Z", cancellable = true)
    private void isStopped_618551094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(618551094L))
            info.setReturnValue(null);
    }


}
