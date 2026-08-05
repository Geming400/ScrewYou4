package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.BabyModelTransform.class)
public class BabyModelTransform_961016953Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1948438085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1948438085L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__174443023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-174443023L))
            info.setReturnValue("Rs秹r.SSuDX2.^0Nv>@o(z 䵿WO|}ZO%踕/䂮{U]WIWh0C|M5N&ꏎ'1");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_999279694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(999279694L))
            info.setReturnValue(-1578557276);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/client/model/geom/builders/MeshDefinition;)Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private void apply_1107804511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1107804511L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.MeshDefinition());
    }

    @Inject(at = @At("HEAD"), method = "babyYHeadOffset()F", cancellable = true)
    private void babyYHeadOffset_999276315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(999276315L))
            info.setReturnValue(1.789899E8F);
    }

    @Inject(at = @At("HEAD"), method = "babyZHeadOffset()F", cancellable = true)
    private void babyZHeadOffset_999276315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(999276315L))
            info.setReturnValue(1.789899E8F);
    }

    @Inject(at = @At("HEAD"), method = "babyHeadScale()F", cancellable = true)
    private void babyHeadScale_999276315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(999276315L))
            info.setReturnValue(1.789899E8F);
    }

    @Inject(at = @At("HEAD"), method = "babyBodyScale()F", cancellable = true)
    private void babyBodyScale_999276315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(999276315L))
            info.setReturnValue(1.789899E8F);
    }

    @Inject(at = @At("HEAD"), method = "bodyYOffset()F", cancellable = true)
    private void bodyYOffset_999276315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(999276315L))
            info.setReturnValue(1.789899E8F);
    }

    @Inject(at = @At("HEAD"), method = "scaleHead()Z", cancellable = true)
    private void scaleHead_999295535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(999295535L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "headParts()Ljava/util/Set;", cancellable = true)
    private void headParts__868018534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-868018534L))
            info.setReturnValue(null);
    }


}
