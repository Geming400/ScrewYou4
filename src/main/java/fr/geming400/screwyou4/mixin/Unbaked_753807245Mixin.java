package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.PlayerHeadSpecialRenderer.Unbaked.class)
public class Unbaked_753807245Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1805306328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1805306328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2139319503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2139319503L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__381652731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-381652731L))
            info.setReturnValue("坧w;9Gb,馚k=c騴gb*QF(Idᠬ%%=(lꅂ罳V$W#(7p\"?fYf4$u!c\"iG0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_792069986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(792069986L))
            info.setReturnValue(-1237718783);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake__934215616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-934215616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/PlayerHeadSpecialRenderer;", cancellable = true)
    private void bake_646983612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(646983612L))
            info.setReturnValue(null);
    }


}
