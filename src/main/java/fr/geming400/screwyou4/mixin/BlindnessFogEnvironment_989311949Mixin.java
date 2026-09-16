package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.fog.environment.BlindnessFogEnvironment.class)
public class BlindnessFogEnvironment_989311949Mixin {
        @Inject(at = @At("HEAD"), method = "getModifiedDarkness(Lnet/minecraft/world/entity/LivingEntity;FF)F", cancellable = true)
    private void getModifiedDarkness__875350005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-875350005L))
            info.setReturnValue(3.4099E8F);
    }

    @Inject(at = @At("HEAD"), method = "setupFog(Lnet/minecraft/client/renderer/fog/FogData;Lnet/minecraft/client/Camera;Lnet/minecraft/client/multiplayer/ClientLevel;FLnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void setupFog_1462667632(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1462667632L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMobEffect()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getMobEffect_717696621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(717696621L))
            info.setReturnValue(null);
    }


}
