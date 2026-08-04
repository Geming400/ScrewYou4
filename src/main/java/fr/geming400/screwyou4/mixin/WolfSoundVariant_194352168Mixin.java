package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.wolf.WolfSoundVariant.class)
public class WolfSoundVariant_194352168Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1579864426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1579864426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__941107808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-941107808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_232614909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(232614909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "adultSounds()Lnet/minecraft/world/entity/animal/wolf/WolfSoundVariant$WolfSoundSet;", cancellable = true)
    private void adultSounds__803825191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-803825191L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "babySounds()Lnet/minecraft/world/entity/animal/wolf/WolfSoundVariant$WolfSoundSet;", cancellable = true)
    private void babySounds__803825191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-803825191L))
            info.setReturnValue(null);
    }


}
