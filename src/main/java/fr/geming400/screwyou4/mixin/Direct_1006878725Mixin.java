package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.HolderSet.Direct.class)
public class Direct_1006878725Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1902576809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1902576809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__128581747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-128581747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1045140970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1045140970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void contains__1741609590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1741609590L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void unwrap_1830154011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1830154011L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBound()Z", cancellable = true)
    private void isBound_1045157307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1045157307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unwrapKey()Ljava/util/Optional;", cancellable = true)
    private void unwrapKey_1252340146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1252340146L))
            info.setReturnValue(null);
    }


}
