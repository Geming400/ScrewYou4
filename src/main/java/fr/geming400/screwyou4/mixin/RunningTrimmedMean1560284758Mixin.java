package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.RunningTrimmedMean.class)
public class RunningTrimmedMean1560284758Mixin {
        @Inject(at = @At("HEAD"), method = "registerValueAndGetMean(J)J", cancellable = true)
    private void registerValueAndGetMean__530958327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-530958327L))
            info.setReturnValue(-8122035383292545781L);
    }


}
