package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.BackgroundMusic.class)
public class BackgroundMusic1328029689Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_419403421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(419403421L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2098453214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2098453214L))
            info.setReturnValue("!G2/YgE7DM45JJ@I /V:Kr1P$,fLfJYA!eo\uC6FF\uC693\u5FD8Q\u525Aso_i0J\uC7DEF$*e");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1885381780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1885381780L))
            info.setReturnValue(479639788);
    }

    @Inject(at = @At("HEAD"), method = "select(ZZ)Ljava/util/Optional;", cancellable = true)
    private void select_1970944611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1970944611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "underwaterMusic()Ljava/util/Optional;", cancellable = true)
    private void underwaterMusic__609918003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609918003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultMusic()Ljava/util/Optional;", cancellable = true)
    private void defaultMusic__558854645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-558854645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withUnderwater(Lnet/minecraft/sounds/Music;)Lnet/minecraft/world/attribute/BackgroundMusic;", cancellable = true)
    private void withUnderwater_192860262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(192860262L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "creativeMusic()Ljava/util/Optional;", cancellable = true)
    private void creativeMusic_1579635549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1579635549L))
            info.setReturnValue(null);
    }


}
