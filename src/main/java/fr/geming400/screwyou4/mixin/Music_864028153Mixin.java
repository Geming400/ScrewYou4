package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.sounds.Music.class)
public class Music_864028153Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__44598116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-44598116L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1634451677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1634451677L))
            info.setReturnValue("/\uBB26RIm0tK\u6439iKU:Ayj\"\uC018.J\" qUZ7;W7\u8FE5A\u9B3BEP(GQ'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1421380243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1421380243L))
            info.setReturnValue(-437095850);
    }

    @Inject(at = @At("HEAD"), method = "sound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void sound__1790717179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1790717179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minDelay()I", cancellable = true)
    private void minDelay__185933779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-185933779L))
            info.setReturnValue(-511801986);
    }

    @Inject(at = @At("HEAD"), method = "maxDelay()I", cancellable = true)
    private void maxDelay__2008239937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2008239937L))
            info.setReturnValue(-1935734227);
    }

    @Inject(at = @At("HEAD"), method = "replaceCurrentMusic()Z", cancellable = true)
    private void replaceCurrentMusic__1459888465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1459888465L))
            info.setReturnValue(false);
    }


}
