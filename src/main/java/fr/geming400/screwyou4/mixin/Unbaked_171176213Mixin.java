package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.ShieldSpecialRenderer.Unbaked.class)
public class Unbaked_171176213Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_1907029936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1907029936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1556688471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1556688471L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__964283763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964283763L))
            info.setReturnValue("k\"\"\u7107&ut-\u063A_@r`SG\uABC4u\uCE79^)JW\u44C6SZ}HK-k\uA67EovBXrR..\u9407M4qSM|<q%:LUD.\u936E*\uA130hViI=\uA589k7\u8C30L+5MF/do");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_209438954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209438954L))
            info.setReturnValue(-1724646216);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake__1516846648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1516846648L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/ShieldSpecialRenderer;", cancellable = true)
    private void bake__1125403828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1125403828L))
            info.setReturnValue(null);
    }


}
