package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ChainedJsonException.class)
public class ChainedJsonException1404167883Mixin {
        @Inject(at = @At("HEAD"), method = "getMessage()Ljava/lang/String;", cancellable = true)
    private void getMessage_764165989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(764165989L))
            info.setReturnValue("NscZ");
    }

    @Inject(at = @At("HEAD"), method = "setFilenameAndFlush(Ljava/lang/String;)V", cancellable = true)
    private void setFilenameAndFlush__250391118(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-250391118L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forException(Ljava/lang/Exception;)Lnet/minecraft/server/ChainedJsonException;", cancellable = true)
    private static void forException__353348758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-353348758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prependJsonKey(Ljava/lang/String;)V", cancellable = true)
    private void prependJsonKey_937452159(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(937452159L))
            info.cancel();
    }


}
