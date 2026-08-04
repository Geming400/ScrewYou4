package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.FilteredText.class)
public class FilteredText1573395704Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1336059333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1336059333L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_437935729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(437935729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1611658446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1611658446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mask()Lnet/minecraft/network/chat/FilterMask;", cancellable = true)
    private void mask_1243100182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1243100182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "raw()Ljava/lang/String;", cancellable = true)
    private void raw_437935233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(437935233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "passThrough(Ljava/lang/String;)Lnet/minecraft/server/network/FilteredText;", cancellable = true)
    private static void passThrough__701930495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-701930495L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFiltered()Z", cancellable = true)
    private void isFiltered_1611674287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1611674287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filtered()Ljava/lang/String;", cancellable = true)
    private void filtered_437935233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(437935233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fullyFiltered(Ljava/lang/String;)Lnet/minecraft/server/network/FilteredText;", cancellable = true)
    private static void fullyFiltered__701930495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-701930495L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filteredOrEmpty()Ljava/lang/String;", cancellable = true)
    private void filteredOrEmpty_437935233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(437935233L))
            info.setReturnValue(null);
    }


}
