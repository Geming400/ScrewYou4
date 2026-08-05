package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.fog.environment.LavaFogEnvironment.class)
public class LavaFogEnvironment248817745Mixin {
        @Inject(at = @At("HEAD"), method = "getBaseColor(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/client/Camera;IF)I", cancellable = true)
    private void getBaseColor_463043163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(463043163L))
            info.setReturnValue(1616948952);
    }

    @Inject(at = @At("HEAD"), method = "isApplicable(Lnet/minecraft/world/level/material/FogType;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void isApplicable_406776510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(406776510L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setupFog(Lnet/minecraft/client/renderer/fog/FogData;Lnet/minecraft/client/Camera;Lnet/minecraft/client/multiplayer/ClientLevel;FLnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void setupFog__1586939114(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1586939114L))
            info.cancel();
    }


}
