package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.fog.environment.BlindnessFogEnvironment.class)
public class BlindnessFogEnvironment_989311949Mixin {
        @Inject(at = @At("HEAD"), method = "getMobEffect()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getMobEffect__1756779576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1756779576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModifiedDarkness(Lnet/minecraft/world/entity/LivingEntity;FF)F", cancellable = true)
    private void getModifiedDarkness_1658256351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1658256351L))
            info.setReturnValue(2.405214E8F);
    }

    @Inject(at = @At("HEAD"), method = "setupFog(Lnet/minecraft/client/renderer/fog/FogData;Lnet/minecraft/client/Camera;Lnet/minecraft/client/multiplayer/ClientLevel;FLnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void setupFog__846444911(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-846444911L))
            info.cancel();
    }


}
