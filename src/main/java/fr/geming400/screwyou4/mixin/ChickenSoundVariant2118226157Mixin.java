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
            info.setReturnValue("ᠡUeQy':\"ⵈdlZkW;7E+_yL{<쌳'Irk{=8eC%>ꑤ=kl@zꑝy-Y娿j됏|/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2138478397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2138478397L))
            info.setReturnValue(-165069630);
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
