package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.multipart.MultiPartModel.Selector.class)
public class Selector_2055479792Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1146853523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1146853523L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1469063980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1469063980L))
            info.setReturnValue(" Ty_zBg?(,\u9968Ia3uj&sf(O\u20A3gIkq:+rHDF25\"sSLt\u9CF4m\uACD9\uF979A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1682135414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1682135414L))
            info.setReturnValue(-1586929129);
    }

    @Inject(at = @At("HEAD"), method = "with(Ljava/lang/Object;)Lnet/minecraft/client/renderer/block/dispatch/multipart/MultiPartModel$Selector;", cancellable = true)
    private void with__1062305733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1062305733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "model()Ljava/lang/Object;", cancellable = true)
    private void model_2054974963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2054974963L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "condition()Ljava/util/function/Predicate;", cancellable = true)
    private void condition__659418344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-659418344L))
            info.setReturnValue(null);
    }


}
