package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ChainedJsonException.class)
public class ChainedJsonException1404167883Mixin {
        @Inject(at = @At("HEAD"), method = "getMessage()Ljava/lang/String;", cancellable = true)
    private void getMessage_268707412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(268707412L))
            info.setReturnValue("Uw@@W=vIrDBwu_Hk.'誺2z>nP,>8, LRdftb=TLmᕩsr豳mNCTYG/䴈K8V2zO!Y/쫢ዽ#%b<㷎76 3f`2u\"o}Ne6Hd%1Nse<6චm퓠Q=");
    }

    @Inject(at = @At("HEAD"), method = "prependJsonKey(Ljava/lang/String;)V", cancellable = true)
    private void prependJsonKey__1738438264(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1738438264L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forException(Ljava/lang/Exception;)Lnet/minecraft/server/ChainedJsonException;", cancellable = true)
    private static void forException__85851932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-85851932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFilenameAndFlush(Ljava/lang/String;)V", cancellable = true)
    private void setFilenameAndFlush__1738438264(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1738438264L))
            info.cancel();
    }


}
