package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.fog.environment.AtmosphericFogEnvironment.class)
public class AtmosphericFogEnvironment_1694998460Mixin {
        @Inject(at = @At("HEAD"), method = "setupFog(Lnet/minecraft/client/renderer/fog/FogData;Lnet/minecraft/client/Camera;Lnet/minecraft/client/multiplayer/ClientLevel;FLnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void setupFog__140758400(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-140758400L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBaseColor(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/client/Camera;IF)I", cancellable = true)
    private void getBaseColor_1909223877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1909223877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isApplicable(Lnet/minecraft/world/level/material/FogType;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void isApplicable_1852957224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1852957224L))
            info.setReturnValue(null);
    }


}
