package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.fog.environment.AtmosphericFogEnvironment.class)
public class AtmosphericFogEnvironment_1694998460Mixin {
        @Inject(at = @At("HEAD"), method = "isApplicable(Lnet/minecraft/world/level/material/FogType;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void isApplicable__1524343791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1524343791L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setupFog(Lnet/minecraft/client/renderer/fog/FogData;Lnet/minecraft/client/Camera;Lnet/minecraft/client/multiplayer/ClientLevel;FLnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void setupFog__2126613153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2126613153L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBaseColor(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/client/Camera;IF)I", cancellable = true)
    private void getBaseColor__1966999775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1966999775L))
            info.setReturnValue(-311756542);
    }


}
