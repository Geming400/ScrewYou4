package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.FilterMask.class)
public class FilterMask_843717538Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2065737996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2065737996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_881979783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881979783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_881996120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881996120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void apply_2056459360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2056459360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/network/chat/FilterMask;)V", cancellable = true)
    private static void write__531628559(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-531628559L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/network/chat/FilterMask;", cancellable = true)
    private static void read__1632414845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1632414845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFiltered(I)V", cancellable = true)
    private void setFiltered_2057634509(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2057634509L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyWithFormatting(Ljava/lang/String;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void applyWithFormatting__684908950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-684908950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFullyFiltered()Z", cancellable = true)
    private void isFullyFiltered_881996120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881996120L))
            info.setReturnValue(null);
    }


}
