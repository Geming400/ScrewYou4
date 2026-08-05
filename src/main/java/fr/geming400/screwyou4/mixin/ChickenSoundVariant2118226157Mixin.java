package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.chicken.ChickenSoundVariant.class)
public class ChickenSoundVariant2118226157Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__791228880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-791228880L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_982766182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(982766182L))
            info.setReturnValue("\u1821UeQy':\"\u2D48dlZkW;7E+_yL{<\uC333'Irk{=8eC%>\uA464=kl@z\uA45Dy-Y\u5A3Fj\uB40F|/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2138478397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2138478397L))
            info.setReturnValue(-131332930);
    }

    @Inject(at = @At("HEAD"), method = "adultSounds()Lnet/minecraft/world/entity/animal/chicken/ChickenSoundVariant$ChickenSoundSet;", cancellable = true)
    private void adultSounds__265518732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-265518732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "babySounds()Lnet/minecraft/world/entity/animal/chicken/ChickenSoundVariant$ChickenSoundSet;", cancellable = true)
    private void babySounds__265518732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-265518732L))
            info.setReturnValue(null);
    }


}
