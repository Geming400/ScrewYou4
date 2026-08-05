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
            info.setReturnValue("b,5JnꧥF)$菟/VF|$]剟0RFX>l3S{t4B$jtl/*;\"7|<md㺇豴W9T䎢$k䅮%M;뢔OYnY>h0 9H맀CLa3컀$6rAII'S&)MzBF|lKJp");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1291842852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1291842852L))
            info.setReturnValue(-1639288370);
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
