package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.Keyframe.class)
public class Keyframe_247562236Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__755958713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-755958713L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__661064033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-661064033L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1017985760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1017985760L))
            info.setReturnValue("\u7B7F\u1687b0\" t5eEy2)\u4ADAI2tCTxi{{qjFVO:QdCS6+o4\u528Bv +ym_#9Dl@QGyXVoq\u769B9kvyc1");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_804914326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(804914326L))
            info.setReturnValue(-147860760);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_599211048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(599211048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ticks()I", cancellable = true)
    private void ticks__1628533461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1628533461L))
            info.setReturnValue(468105416);
    }


}
