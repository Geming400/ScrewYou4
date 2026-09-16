package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.OptionInstance.ClampingLazyMaxIntRange.class)
public class ClampingLazyMaxIntRange173372969Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__735253299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-735253299L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_943796494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(943796494L))
            info.setReturnValue("z\u2993d$T");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_730725060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(730725060L))
            info.setReturnValue(1574394453);
    }

    @Inject(at = @At("HEAD"), method = "validateValue(Ljava/lang/Object;)Ljava/util/Optional;", cancellable = true)
    private void validateValue_788158646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(788158646L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateValue(Ljava/lang/Integer;)Ljava/util/Optional;", cancellable = true)
    private void validateValue_1987668911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1987668911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCycleButton()Z", cancellable = true)
    private void createCycleButton_1545086020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1545086020L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "valueListSupplier()Lnet/minecraft/client/gui/components/CycleButton$ValueListSupplier;", cancellable = true)
    private void valueListSupplier_530273240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530273240L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxSupplier()Ljava/util/function/IntSupplier;", cancellable = true)
    private void maxSupplier__1770488413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1770488413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encodableMaxInclusive()I", cancellable = true)
    private void encodableMaxInclusive__153068258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-153068258L))
            info.setReturnValue(1647488073);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__1631336571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1631336571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minInclusive()I", cancellable = true)
    private void minInclusive_518578325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(518578325L))
            info.setReturnValue(-692419831);
    }

    @Inject(at = @At("HEAD"), method = "maxInclusive()I", cancellable = true)
    private void maxInclusive__1796466649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1796466649L))
            info.setReturnValue(-300309110);
    }


}
