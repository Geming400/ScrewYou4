package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.arrow.Arrow.class)
public class Arrow_94181061Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick__35502598(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-35502598L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_847929176(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(847929176L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getColor()I", cancellable = true)
    private void getColor_1033083677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1033083677L))
            info.setReturnValue(1015876231);
    }

    @Inject(at = @At("HEAD"), method = "addEffect(Lnet/minecraft/world/effect/MobEffectInstance;)V", cancellable = true)
    private void addEffect__1362133957(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1362133957L))
            info.cancel();
    }


}
