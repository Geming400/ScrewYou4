package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.SharedConstants.class)
public class SharedConstants_1541575108Mixin {
        @Inject(at = @At("HEAD"), method = "getProtocolVersion()I", cancellable = true)
    private static void getProtocolVersion__609874441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609874441L))
            info.setReturnValue(804311350);
    }

    @Inject(at = @At("HEAD"), method = "setVersion(Lnet/minecraft/WorldVersion;)V", cancellable = true)
    private static void setVersion__1897421715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1897421715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tryDetectVersion()V", cancellable = true)
    private static void tryDetectVersion__1931213068(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1931213068L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCurrentVersion()Lnet/minecraft/WorldVersion;", cancellable = true)
    private static void getCurrentVersion__383857116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-383857116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "debugVoidTerrain(Lnet/minecraft/world/level/ChunkPos;)Z", cancellable = true)
    private static void debugVoidTerrain__440719504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-440719504L))
            info.setReturnValue(false);
    }


}
