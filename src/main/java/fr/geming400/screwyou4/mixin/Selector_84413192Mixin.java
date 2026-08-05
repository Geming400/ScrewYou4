package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.variant.PriorityProvider.Selector.class)
public class Selector_84413192Mixin {
        @Inject(at = @At("HEAD"), method = "priority()I", cancellable = true)
    private void priority_872795593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(872795593L))
            info.setReturnValue(555543992);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__824213077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-824213077L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_854836716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(854836716L))
            info.setReturnValue("?'M3o,(u\uD1E9'*W\uFDBF}k!_*uF-\u8A02e(Fiu\uD1BAY$]zfH8\u89FE}muDKt_iba9}9ezl].U2dIr{yYk-T\u9269Av@L.\u7870x32q\uFCAB_wl?=\u90CCxgB0}p");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_641765282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(641765282L))
            info.setReturnValue(1681771865);
    }

    @Inject(at = @At("HEAD"), method = "condition()Ljava/util/Optional;", cancellable = true)
    private void condition_926157008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(926157008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_436062004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(436062004L))
            info.setReturnValue(null);
    }


}
