package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.HangingSignBlockEntity.class)
public class HangingSignBlockEntity_108066183Mixin {
        @Inject(at = @At("HEAD"), method = "getSignInteractionFailedSoundEvent()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getSignInteractionFailedSoundEvent_955433761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955433761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxTextLineWidth()I", cancellable = true)
    private void getMaxTextLineWidth_1699780053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699780053L))
            info.setReturnValue(236831088);
    }

    @Inject(at = @At("HEAD"), method = "getTextLineHeight()I", cancellable = true)
    private void getTextLineHeight_475185646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(475185646L))
            info.setReturnValue(-2032202282);
    }


}
