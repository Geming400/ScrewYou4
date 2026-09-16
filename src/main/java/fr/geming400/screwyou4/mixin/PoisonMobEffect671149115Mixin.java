package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.effect.PoisonMobEffect.class)
public class PoisonMobEffect671149115Mixin {
        @Inject(at = @At("HEAD"), method = "applyEffectTick(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;I)Z", cancellable = true)
    private void applyEffectTick__1635105296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1635105296L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldApplyEffectTickThisTick(II)Z", cancellable = true)
    private void shouldApplyEffectTickThisTick__1537614482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1537614482L))
            info.setReturnValue(false);
    }


}
