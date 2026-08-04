package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.MultiVariant.class)
public class MultiVariant_1633049584Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1276405454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1276405454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_497589608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(497589608L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1671312325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671312325L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/client/renderer/block/dispatch/VariantMutator;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private void with__1718747718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1718747718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "variants()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void variants_1126565717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1126565717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toUnbaked()Lnet/minecraft/client/renderer/block/dispatch/BlockStateModel$Unbaked;", cancellable = true)
    private void toUnbaked__858906559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-858906559L))
            info.setReturnValue(null);
    }


}
