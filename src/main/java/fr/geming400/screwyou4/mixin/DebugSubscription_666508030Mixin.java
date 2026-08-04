package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugSubscription.class)
public class DebugSubscription_666508030Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__468952442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-468952442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expireAfterTicks()I", cancellable = true)
    private void expireAfterTicks_704770275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(704770275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueStreamCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private void valueStreamCodec_1927508153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1927508153L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyUpdate()Lnet/minecraft/util/debug/DebugSubscription$Update;", cancellable = true)
    private void emptyUpdate_25608943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(25608943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packEvent(Ljava/lang/Object;)Lnet/minecraft/util/debug/DebugSubscription$Event;", cancellable = true)
    private void packEvent__602616226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-602616226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packUpdate(Ljava/lang/Object;)Lnet/minecraft/util/debug/DebugSubscription$Update;", cancellable = true)
    private void packUpdate__2002335349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2002335349L))
            info.setReturnValue(null);
    }


}
