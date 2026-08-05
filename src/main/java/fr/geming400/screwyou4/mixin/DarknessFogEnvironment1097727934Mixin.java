package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.fog.environment.DarknessFogEnvironment.class)
public class DarknessFogEnvironment1097727934Mixin {
        @Inject(at = @At("HEAD"), method = "getMobEffect()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getMobEffect__1648363590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1648363590L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModifiedDarkness(Lnet/minecraft/world/entity/LivingEntity;FF)F", cancellable = true)
    private void getModifiedDarkness_1766672337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1766672337L))
            info.setReturnValue(5.203678E8F);
    }

    @Inject(at = @At("HEAD"), method = "setupFog(Lnet/minecraft/client/renderer/fog/FogData;Lnet/minecraft/client/Camera;Lnet/minecraft/client/multiplayer/ClientLevel;FLnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void setupFog__738028925(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-738028925L))
            info.cancel();
    }


}
