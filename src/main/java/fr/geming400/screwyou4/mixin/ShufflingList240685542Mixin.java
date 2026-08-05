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
            info.setReturnValue("@M'뮦BvVO똷2:*yᣘ8Xz3P+tEx膜:⊗膋oZ<oc%A]3p쉐'ឋ>rc3]P᷃ꗵ'eT쩄霚LKHn콭ﯣ.]&Ra(ྱ.GbgP*BORO375{P@");
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
