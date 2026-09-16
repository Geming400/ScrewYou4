package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.BellSpecialRenderer.Unbaked.class)
public class Unbaked1277018833Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__118231821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-118231821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_368392565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(368392565L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2047442358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2047442358L))
            info.setReturnValue("\u1BC2cc';a8G:t,>u3.!\u39A0w>[A'=u<\u0AFB[\"\u9988_{}j\u4BF2A^oZ\u8A40%U?Vt\u52D3\u535CWm?\uCF78ito|$7rGB+QO");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1834370924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1834370924L))
            info.setReturnValue(-468545499);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake__1845146082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1845146082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/BellSpecialRenderer;", cancellable = true)
    private void bake_1681437418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681437418L))
            info.setReturnValue(null);
    }


}
