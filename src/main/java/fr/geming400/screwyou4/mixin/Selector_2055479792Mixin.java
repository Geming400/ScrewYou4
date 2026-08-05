package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.multipart.MultiPartModel.Selector.class)
public class Selector_2055479792Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__853975246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-853975246L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_920019816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(920019816L))
            info.setReturnValue("LK<qA.s.}\u5807\u942DxxM\uC1A2iyP7[q2{z\u8156irOEcP&'s)%DAq=C!f\uBDC2nYd\u57C3FBVd@,{aFLYyA\"a2A2<u[m'O\u3499j\u99F6l\u66A6^svROmV");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2093742533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2093742533L))
            info.setReturnValue(1148297225);
    }

    @Inject(at = @At("HEAD"), method = "with(Ljava/lang/Object;)Lnet/minecraft/client/renderer/block/dispatch/multipart/MultiPartModel$Selector;", cancellable = true)
    private void with_1275118581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1275118581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "model()Ljava/lang/Object;", cancellable = true)
    private void model__380295286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-380295286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "condition()Ljava/util/function/Predicate;", cancellable = true)
    private void condition_1405594813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1405594813L))
            info.setReturnValue(null);
    }


}
