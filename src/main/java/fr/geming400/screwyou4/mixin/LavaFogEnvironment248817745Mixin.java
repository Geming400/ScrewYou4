package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.fog.environment.LavaFogEnvironment.class)
public class LavaFogEnvironment248817745Mixin {
        @Inject(at = @At("HEAD"), method = "isApplicable(Lnet/minecraft/world/level/material/FogType;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void isApplicable_1324442791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1324442791L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setupFog(Lnet/minecraft/client/renderer/fog/FogData;Lnet/minecraft/client/Camera;Lnet/minecraft/client/multiplayer/ClientLevel;FLnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void setupFog_722173429(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(722173429L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBaseColor(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/client/Camera;IF)I", cancellable = true)
    private void getBaseColor_881786807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881786807L))
            info.setReturnValue(776367334);
    }


}
