package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.effect.InstantaneousMobEffect.class)
public class InstantaneousMobEffect1269805931Mixin {
        @Inject(at = @At("HEAD"), method = "isInstantaneous()Z", cancellable = true)
    private void isInstantaneous_1308084514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1308084514L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldApplyEffectTickThisTick(II)Z", cancellable = true)
    private void shouldApplyEffectTickThisTick_273930306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(273930306L))
            info.setReturnValue(true);
    }


}
