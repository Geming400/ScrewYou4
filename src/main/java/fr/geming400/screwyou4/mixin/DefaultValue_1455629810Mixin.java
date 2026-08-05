package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.DeltaTracker.DefaultValue.class)
public class DefaultValue_1455629810Mixin {
        @Inject(at = @At("HEAD"), method = "getGameTimeDeltaTicks()F", cancellable = true)
    private void getGameTimeDeltaTicks_1493889172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1493889172L))
            info.setReturnValue(3.207651E8F);
    }

    @Inject(at = @At("HEAD"), method = "getRealtimeDeltaTicks()F", cancellable = true)
    private void getRealtimeDeltaTicks_1493889172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1493889172L))
            info.setReturnValue(3.207651E8F);
    }

    @Inject(at = @At("HEAD"), method = "getGameTimeDeltaPartialTick(Z)F", cancellable = true)
    private void getGameTimeDeltaPartialTick__1609736034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1609736034L))
            info.setReturnValue(3.207651E8F);
    }


}
