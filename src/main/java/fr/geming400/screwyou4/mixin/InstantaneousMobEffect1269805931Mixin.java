package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.effect.InstantaneousMobEffect.class)
public class InstantaneousMobEffect1269805931Mixin {
        @Inject(at = @At("HEAD"), method = "shouldApplyEffectTickThisTick(II)Z", cancellable = true)
    private void shouldApplyEffectTickThisTick__938957666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-938957666L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isInstantaneous()Z", cancellable = true)
    private void isInstantaneous__527406570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-527406570L))
            info.setReturnValue(false);
    }


}
