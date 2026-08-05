package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.timers.TimerQueue.Packed.class)
public class Packed_1298055526Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1611399512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1611399512L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_162595550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(162595550L))
            info.setReturnValue("<ZbLhG3nY|W旫`H괚;뼐갱y>{ `䊅2凂oL5N7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1336318267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1336318267L))
            info.setReturnValue(726436427);
    }

    @Inject(at = @At("HEAD"), method = "events()Ljava/util/List;", cancellable = true)
    private void events__1370574955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370574955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1781733500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1781733500L))
            info.setReturnValue(null);
    }


}
