package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.ShadowFeatureRenderer.Submit.class)
public class Submit_1162854479Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_254228210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(254228210L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1933278003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1933278003L))
            info.setReturnValue("L,<>@e\".:f\u3F3Et4iSI|mbA]CN>'o !'5ha");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1720206569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1720206569L))
            info.setReturnValue(-875515137);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType_970430724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(970430724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix4fc;", cancellable = true)
    private void pose__562322691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-562322691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "radius()F", cancellable = true)
    private void radius__1664079457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1664079457L))
            info.setReturnValue(9.299877E8F);
    }

    @Inject(at = @At("HEAD"), method = "pieces()Ljava/util/List;", cancellable = true)
    private void pieces__2039993021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2039993021L))
            info.setReturnValue(null);
    }


}
