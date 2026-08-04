package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.OptionInstance.ClampingLazyMaxIntRange.class)
public class ClampingLazyMaxIntRange173372969Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1558885228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558885228L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__962087006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-962087006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_211635711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(211635711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateValue(Ljava/lang/Integer;)Ljava/util/Optional;", cancellable = true)
    private void validateValue__1127612278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1127612278L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateValue(Ljava/lang/Object;)Ljava/util/Optional;", cancellable = true)
    private void validateValue__836354949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-836354949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__218592657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-218592657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minInclusive()I", cancellable = true)
    private void minInclusive_211635215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(211635215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCycleButton()Z", cancellable = true)
    private void createCycleButton_211651552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(211651552L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueListSupplier()Lnet/minecraft/client/gui/components/CycleButton$ValueListSupplier;", cancellable = true)
    private void valueListSupplier__1842862893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1842862893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxInclusive()I", cancellable = true)
    private void maxInclusive_211635215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(211635215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxSupplier()Ljava/util/function/IntSupplier;", cancellable = true)
    private void maxSupplier__1148484013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1148484013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encodableMaxInclusive()I", cancellable = true)
    private void encodableMaxInclusive_211635215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(211635215L))
            info.setReturnValue(null);
    }


}
