package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.RunningTrimmedMean.class)
public class RunningTrimmedMean1560284758Mixin {
        @Inject(at = @At("HEAD"), method = "registerValueAndGetMean(J)J", cancellable = true)
    private void registerValueAndGetMean__1519853577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519853577L))
            info.setReturnValue(-5730257664011755711L);
    }


}
