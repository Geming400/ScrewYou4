package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.sounds.Music.class)
public class Music_864028153Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2045426885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2045426885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__271431823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-271431823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_902290894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902290894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxDelay()I", cancellable = true)
    private void maxDelay_902290398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902290398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minDelay()I", cancellable = true)
    private void minDelay_902290398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902290398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void sound__1882063372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1882063372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceCurrentMusic()Z", cancellable = true)
    private void replaceCurrentMusic_902306735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902306735L))
            info.setReturnValue(null);
    }


}
