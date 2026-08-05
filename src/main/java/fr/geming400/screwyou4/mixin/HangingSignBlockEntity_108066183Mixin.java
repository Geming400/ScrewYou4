package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.HangingSignBlockEntity.class)
public class HangingSignBlockEntity_108066183Mixin {
        @Inject(at = @At("HEAD"), method = "getMaxTextLineWidth()I", cancellable = true)
    private void getMaxTextLineWidth_146328428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(146328428L))
            info.setReturnValue(-322106046);
    }

    @Inject(at = @At("HEAD"), method = "getTextLineHeight()I", cancellable = true)
    private void getTextLineHeight_146328428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(146328428L))
            info.setReturnValue(-322106046);
    }

    @Inject(at = @At("HEAD"), method = "getSignInteractionFailedSoundEvent()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getSignInteractionFailedSoundEvent_1198279080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1198279080L))
            info.setReturnValue(null);
    }


}
