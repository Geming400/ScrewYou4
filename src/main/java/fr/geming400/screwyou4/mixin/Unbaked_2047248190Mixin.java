package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.EndCubeSpecialRenderer.Unbaked.class)
public class Unbaked_2047248190Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_651997535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(651997535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1138621921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1138621921L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1477295582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1477295582L))
            info.setReturnValue("\u3481P\u3074\u6914CH@Q1k\u85DD)90A]g]|y`fTU_<e\u30CDnB2CvG+P]ePmpv?YD6nq'c\u329A\u4F118t\u4B87\u3DBA\u4726$'7wL*C05:M\u2C3ETBy2Qu@rd?[t}_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1690367016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1690367016L))
            info.setReturnValue(-832990368);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake__1075045686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1075045686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "effect()Lnet/minecraft/client/renderer/special/EndCubeSpecialRenderer$Type;", cancellable = true)
    private void effect__64446832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-64446832L))
            info.setReturnValue(net.minecraft.client.renderer.special.EndCubeSpecialRenderer.Type.GATEWAY);
    }


}
