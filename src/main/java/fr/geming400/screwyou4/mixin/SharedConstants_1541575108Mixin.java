package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.SharedConstants.class)
public class SharedConstants_1541575108Mixin {
        @Inject(at = @At("HEAD"), method = "getProtocolVersion()I", cancellable = true)
    private static void getProtocolVersion_1579837601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1579837601L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setVersion(Lnet/minecraft/WorldVersion;)V", cancellable = true)
    private static void setVersion__1462521917(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1462521917L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tryDetectVersion()V", cancellable = true)
    private static void tryDetectVersion_1579850094(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1579850094L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "debugVoidTerrain(Lnet/minecraft/world/level/ChunkPos;)Z", cancellable = true)
    private static void debugVoidTerrain__1238505890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1238505890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCurrentVersion()Lnet/minecraft/WorldVersion;", cancellable = true)
    private static void getCurrentVersion_2106263567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2106263567L))
            info.setReturnValue(null);
    }


}
