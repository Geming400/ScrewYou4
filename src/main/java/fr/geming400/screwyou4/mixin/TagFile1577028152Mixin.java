package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.tags.TagFile.class)
public class TagFile1577028152Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_668401884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(668401884L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1947515619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1947515619L))
            info.setReturnValue("]m9{|P\u12EA\u1F3Cnyr>\uD274e6f|l\u1E647HBU");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2134380243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2134380243L))
            info.setReturnValue(-1478014535);
    }

    @Inject(at = @At("HEAD"), method = "replace()Z", cancellable = true)
    private void replace_1985117627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1985117627L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries_1873941752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1873941752L))
            info.setReturnValue(null);
    }


}
