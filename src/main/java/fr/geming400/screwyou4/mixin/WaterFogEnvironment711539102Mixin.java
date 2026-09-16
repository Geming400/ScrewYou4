package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.fog.environment.WaterFogEnvironment.class)
public class WaterFogEnvironment711539102Mixin {
        @Inject(at = @At("HEAD"), method = "isApplicable(Lnet/minecraft/world/level/material/FogType;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void isApplicable_1787164148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1787164148L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setupFog(Lnet/minecraft/client/renderer/fog/FogData;Lnet/minecraft/client/Camera;Lnet/minecraft/client/multiplayer/ClientLevel;FLnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void setupFog_1184894786(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1184894786L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBaseColor(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/client/Camera;IF)I", cancellable = true)
    private void getBaseColor_1344508164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1344508164L))
            info.setReturnValue(553382702);
    }


}
