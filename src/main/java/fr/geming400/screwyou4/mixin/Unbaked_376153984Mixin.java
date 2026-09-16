package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.TridentSpecialRenderer.Unbaked.class)
public class Unbaked_376153984Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1019096671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1019096671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__532472285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-532472285L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1146577508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1146577508L))
            info.setReturnValue("'\u64A4,W8gmoBZY7J2ybu}\u9A36G^Z?)aE'\u9E67t\uBE6DP6Y|h\uAB9C2r&ja\uC530g\u7C8C1diG");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_933506074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(933506074L))
            info.setReturnValue(-1724362443);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake_1548956364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1548956364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/TridentSpecialRenderer;", cancellable = true)
    private void bake_2062416053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2062416053L))
            info.setReturnValue(null);
    }


}
