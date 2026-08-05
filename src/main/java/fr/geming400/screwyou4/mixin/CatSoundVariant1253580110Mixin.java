package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.feline.CatSoundVariant.class)
public class CatSoundVariant1253580110Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1655874927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1655874927L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_118120135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(118120135L))
            info.setReturnValue("b,5Jn\uA9E5F)$\u83DF/VF|$]\u525F0RFX>l3S{t4B$jtl/*;\"7|<md\u3E87\u8C74W9T\u43A2$k\u416E%M;\uB894OYnY>h0 9H\uB9C0CLa3\uCEC0$6rAII'S&)MzBF|lKJp");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1291842852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1291842852L))
            info.setReturnValue(-1517653870);
    }

    @Inject(at = @At("HEAD"), method = "adultSounds()Lnet/minecraft/world/entity/animal/feline/CatSoundVariant$CatSoundSet;", cancellable = true)
    private void adultSounds_2028996719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2028996719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "babySounds()Lnet/minecraft/world/entity/animal/feline/CatSoundVariant$CatSoundSet;", cancellable = true)
    private void babySounds_2028996719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2028996719L))
            info.setReturnValue(null);
    }


}
