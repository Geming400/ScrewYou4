package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.fog.environment.PowderedSnowFogEnvironment.class)
public class PowderedSnowFogEnvironment1901156652Mixin {
        @Inject(at = @At("HEAD"), method = "getBaseColor(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/client/Camera;IF)I", cancellable = true)
    private void getBaseColor_2115382070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2115382070L))
            info.setReturnValue(867347097);
    }

    @Inject(at = @At("HEAD"), method = "isApplicable(Lnet/minecraft/world/level/material/FogType;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void isApplicable_2059115417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2059115417L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setupFog(Lnet/minecraft/client/renderer/fog/FogData;Lnet/minecraft/client/Camera;Lnet/minecraft/client/multiplayer/ClientLevel;FLnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void setupFog_65399793(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(65399793L))
            info.cancel();
    }


}
