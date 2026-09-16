package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.metadata.pack.PackFormat.IntermediaryFormat.class)
public class IntermediaryFormat_1453337404Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_544711135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(544711135L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2071206368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2071206368L))
            info.setReturnValue("QULsV=Qy)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2010689494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2010689494L))
            info.setReturnValue(-580272995);
    }

    @Inject(at = @At("HEAD"), method = "min()Ljava/util/Optional;", cancellable = true)
    private void min_1537862971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1537862971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "max()Ljava/util/Optional;", cancellable = true)
    private void max_1992447565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1992447565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "format()Ljava/util/Optional;", cancellable = true)
    private void format__779690016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-779690016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(IZZLjava/lang/String;Ljava/lang/String;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void validate_1677410893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1677410893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "supported()Ljava/util/Optional;", cancellable = true)
    private void supported_430688151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(430688151L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromRange(Lnet/minecraft/util/InclusiveRange;I)Lnet/minecraft/server/packs/metadata/pack/PackFormat$IntermediaryFormat;", cancellable = true)
    private static void fromRange_1854434545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1854434545L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "effectiveMinMajorVersion()I", cancellable = true)
    private void effectiveMinMajorVersion_1924084663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1924084663L))
            info.setReturnValue(-358739789);
    }


}
