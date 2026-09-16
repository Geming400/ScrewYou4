package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.BabyModelTransform.class)
public class BabyModelTransform_961016953Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_52390684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(52390684L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1731440477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1731440477L))
            info.setReturnValue("FV,\"@?x\u02ACF:\uD78F00f\u61FB({A|Ub%L)Z\uC973?=Fs6?A\u9E204s/X7\"\u2F9A\u0587\"Wh)\u685C?>\u6417\u28F0;JUt @\uCF31'Ief\u519Al3$\uB205R\u7DAC");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1518369043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1518369043L))
            info.setReturnValue(-1929383773);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/client/model/geom/builders/MeshDefinition;)Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private void apply__770623923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-770623923L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.MeshDefinition());
    }

    @Inject(at = @At("HEAD"), method = "scaleHead()Z", cancellable = true)
    private void scaleHead_1872286245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1872286245L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "headParts()Ljava/util/Set;", cancellable = true)
    private void headParts_473407930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(473407930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bodyYOffset()F", cancellable = true)
    private void bodyYOffset__656000271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-656000271L))
            info.setReturnValue(8.349724E8F);
    }

    @Inject(at = @At("HEAD"), method = "babyYHeadOffset()F", cancellable = true)
    private void babyYHeadOffset_238362533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(238362533L))
            info.setReturnValue(8.349724E8F);
    }

    @Inject(at = @At("HEAD"), method = "babyHeadScale()F", cancellable = true)
    private void babyHeadScale_1981573255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1981573255L))
            info.setReturnValue(8.349724E8F);
    }

    @Inject(at = @At("HEAD"), method = "babyBodyScale()F", cancellable = true)
    private void babyBodyScale__908097079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-908097079L))
            info.setReturnValue(8.349724E8F);
    }

    @Inject(at = @At("HEAD"), method = "babyZHeadOffset()F", cancellable = true)
    private void babyZHeadOffset__272171644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-272171644L))
            info.setReturnValue(8.349724E8F);
    }


}
