package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.TridentSpecialRenderer.Unbaked.class)
public class Unbaked_376153984Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_2112007707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2112007707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1761666242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1761666242L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__759305992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-759305992L))
            info.setReturnValue("fgh8\u1972\u600227Uy$C7z!ncCE\uD461");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_414416725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(414416725L))
            info.setReturnValue(292524568);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake__1311868877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1311868877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/TridentSpecialRenderer;", cancellable = true)
    private void bake_1588428892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1588428892L))
            info.setReturnValue(null);
    }


}
