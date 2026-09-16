package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.timers.TimerQueue.Packed.class)
public class Packed_1298055526Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_389429257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(389429257L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2068479050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2068479050L))
            info.setReturnValue("L-^L^|\u7B9DB*D\u0DD2*0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1855407616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1855407616L))
            info.setReturnValue(1300107521);
    }

    @Inject(at = @At("HEAD"), method = "events()Ljava/util/List;", cancellable = true)
    private void events_1116473902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1116473902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1649704338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1649704338L))
            info.setReturnValue(null);
    }


}
