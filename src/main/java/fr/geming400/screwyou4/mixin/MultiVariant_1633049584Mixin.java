package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.MultiVariant.class)
public class MultiVariant_1633049584Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_724423315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(724423315L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1891494188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1891494188L))
            info.setReturnValue("/w$`Wvo'miQ;+y[\uD005:hcHwF");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2104565622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2104565622L))
            info.setReturnValue(1613018888);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/client/renderer/block/dispatch/VariantMutator;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private void with__2083939712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083939712L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "variants()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void variants_1247210211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1247210211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toUnbaked()Lnet/minecraft/client/renderer/block/dispatch/BlockStateModel$Unbaked;", cancellable = true)
    private void toUnbaked__1487132872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1487132872L))
            info.setReturnValue(null);
    }


}
