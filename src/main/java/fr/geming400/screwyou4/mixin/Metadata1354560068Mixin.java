package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.repository.Pack.Metadata.class)
public class Metadata1354560068Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1554894969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1554894969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_219100093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(219100093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1392822810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1392822810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void description__822349097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-822349097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compatibility()Lnet/minecraft/server/packs/repository/PackCompatibility;", cancellable = true)
    private void compatibility_1114088937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114088937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requestedFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void requestedFeatures_2019380566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2019380566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overlays()Ljava/util/List;", cancellable = true)
    private void overlays__1314070412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1314070412L))
            info.setReturnValue(null);
    }


}
