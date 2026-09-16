package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.fog.environment.PowderedSnowFogEnvironment.class)
public class PowderedSnowFogEnvironment1901156652Mixin {
        @Inject(at = @At("HEAD"), method = "getBaseColor(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/client/Camera;IF)I", cancellable = true)
    private void getBaseColor__1760841582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1760841582L))
            info.setReturnValue(-2085298079);
    }

    @Inject(at = @At("HEAD"), method = "isApplicable(Lnet/minecraft/world/level/material/FogType;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void isApplicable__1318185598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1318185598L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setupFog(Lnet/minecraft/client/renderer/fog/FogData;Lnet/minecraft/client/Camera;Lnet/minecraft/client/multiplayer/ClientLevel;FLnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void setupFog__1920454960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1920454960L))
            info.cancel();
    }


}
