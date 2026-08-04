package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.metadata.pack.PackFormat.IntermediaryFormat.class)
public class IntermediaryFormat_1453337404Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1456117634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1456117634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_317877428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(317877428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1491600145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1491600145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "min()Ljava/util/Optional;", cancellable = true)
    private void min_1698798825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1698798825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "max()Ljava/util/Optional;", cancellable = true)
    private void max_1698798825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1698798825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "format()Ljava/util/Optional;", cancellable = true)
    private void format_1698798825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1698798825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(IZZLjava/lang/String;Ljava/lang/String;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void validate_249480503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(249480503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "supported()Ljava/util/Optional;", cancellable = true)
    private void supported_1698798825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1698798825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "effectiveMinMajorVersion()I", cancellable = true)
    private void effectiveMinMajorVersion_1491599649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1491599649L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromRange(Lnet/minecraft/util/InclusiveRange;I)Lnet/minecraft/server/packs/metadata/pack/PackFormat$IntermediaryFormat;", cancellable = true)
    private static void fromRange_1145793342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1145793342L))
            info.setReturnValue(null);
    }


}
