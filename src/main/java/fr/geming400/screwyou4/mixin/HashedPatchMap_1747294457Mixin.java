package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.HashedPatchMap.class)
public class HashedPatchMap_1747294457Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_838668188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(838668188L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1777249315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1777249315L))
            info.setReturnValue("-b{Vv@v1HBz,nEq<rfG2OWR-L+\u0C77fz[2CdfgO;\uD5C1`gl4Tav8M%\u3279\"z4}\u7E5ELIEy`s?%/&{c");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1990320749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1990320749L))
            info.setReturnValue(503691671);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/core/component/DataComponentPatch;Lnet/minecraft/network/HashedPatchMap$HashGenerator;)Z", cancellable = true)
    private void matches_309772942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(309772942L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/core/component/DataComponentPatch;Lnet/minecraft/network/HashedPatchMap$HashGenerator;)Lnet/minecraft/network/HashedPatchMap;", cancellable = true)
    private static void create_1009833664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1009833664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addedComponents()Ljava/util/Map;", cancellable = true)
    private void addedComponents__656035862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-656035862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removedComponents()Ljava/util/Set;", cancellable = true)
    private void removedComponents_338589636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(338589636L))
            info.setReturnValue(null);
    }


}
