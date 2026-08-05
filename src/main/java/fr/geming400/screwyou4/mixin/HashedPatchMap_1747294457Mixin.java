package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.HashedPatchMap.class)
public class HashedPatchMap_1747294457Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1162160581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1162160581L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_611834481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611834481L))
            info.setReturnValue("ZA%UB=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1785557198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1785557198L))
            info.setReturnValue(272605775);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/core/component/DataComponentPatch;Lnet/minecraft/network/HashedPatchMap$HashGenerator;)Z", cancellable = true)
    private void matches__1748008677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1748008677L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/core/component/DataComponentPatch;Lnet/minecraft/network/HashedPatchMap$HashGenerator;)Lnet/minecraft/network/HashedPatchMap;", cancellable = true)
    private static void create__252686532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-252686532L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addedComponents()Ljava/util/Map;", cancellable = true)
    private void addedComponents__257329184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-257329184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removedComponents()Ljava/util/Set;", cancellable = true)
    private void removedComponents__81741030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-81741030L))
            info.setReturnValue(null);
    }


}
