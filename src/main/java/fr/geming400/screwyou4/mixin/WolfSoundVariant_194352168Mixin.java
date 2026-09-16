package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.wolf.WolfSoundVariant.class)
public class WolfSoundVariant_194352168Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__714274101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-714274101L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_964775692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(964775692L))
            info.setReturnValue("g1XD\u8233A8m5\u6FF1.IT|h/v7J&\u60F4Z\u8D7AZOB\u627C7WP%U\u7DE1<{Y6T5I[C}&*O\uD2B8o,A#2}(3\u4C57s\uB51FFkSxQ-*!1k");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_751704258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(751704258L))
            info.setReturnValue(28633591);
    }

    @Inject(at = @At("HEAD"), method = "babySounds()Lnet/minecraft/world/entity/animal/wolf/WolfSoundVariant$WolfSoundSet;", cancellable = true)
    private void babySounds__1370604781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370604781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "adultSounds()Lnet/minecraft/world/entity/animal/wolf/WolfSoundVariant$WolfSoundSet;", cancellable = true)
    private void adultSounds_1964961783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1964961783L))
            info.setReturnValue(null);
    }


}
