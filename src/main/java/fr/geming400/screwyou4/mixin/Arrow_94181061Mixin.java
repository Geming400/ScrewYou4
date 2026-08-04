package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.arrow.Arrow.class)
public class Arrow_94181061Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_132455799(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(132455799L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getColor()I", cancellable = true)
    private void getColor_132443306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(132443306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1301633385(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1301633385L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addEffect(Lnet/minecraft/world/effect/MobEffectInstance;)V", cancellable = true)
    private void addEffect_250049293(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(250049293L))
            info.cancel();
    }


}
