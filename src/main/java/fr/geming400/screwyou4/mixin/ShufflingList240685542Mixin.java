package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.ShufflingList.class)
public class ShufflingList240685542Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__894774929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-894774929L))
            info.setReturnValue("@M'\uBBA6BvVO\uB6372:*y\u18D88Xz3P+tEx\u819C:\u2297\u818BoZ<oc%A]3p\uC250'\u178B>rc3]P\u1DC3\uA5F5'eT\uCA44\u971ALKHn\uCF6D\uFBE3.]&Ra(\u0FB1.GbgP*BORO375{P@");
    }

    @Inject(at = @At("HEAD"), method = "add(Ljava/lang/Object;I)Lnet/minecraft/world/entity/ai/behavior/ShufflingList;", cancellable = true)
    private void add_1419308692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1419308692L))
            info.setReturnValue(new net.minecraft.world.entity.ai.behavior.ShufflingList());
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__1910930490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1910930490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stream()Ljava/util/stream/Stream;", cancellable = true)
    private void stream_29979227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(29979227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shuffle()Lnet/minecraft/world/entity/ai/behavior/ShufflingList;", cancellable = true)
    private void shuffle_962436305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(962436305L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_724363517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(724363517L))
            info.setReturnValue(null);
    }


}
