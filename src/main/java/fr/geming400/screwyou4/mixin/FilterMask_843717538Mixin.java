package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.FilterMask.class)
public class FilterMask_843717538Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__64909227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-64909227L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1401069132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1401069132L))
            info.setReturnValue(-2023358790);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1902833909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1902833909L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void apply_1005720014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1005720014L))
            info.setReturnValue("\uAB83c\u8287 \u7C5A*BQnav]i\"]\uCFE7YZ\uAED8uI2\uA1CA\uBD72/B{jmb|L.Jr3hS\"}{\u9DE9\u0F34(!Ds-\uC4FFT1\uD71D\u42ADh71O\u74FC]=\"\u2DFD\"#X\uD52FNn>&X\u0A09ys]lbJq/:M\"e6w9}g\u9193");
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/network/chat/FilterMask;)V", cancellable = true)
    private static void write_517176242(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(517176242L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/network/chat/FilterMask;", cancellable = true)
    private static void read__454163559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-454163559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFiltered(I)V", cancellable = true)
    private void setFiltered__954538842(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-954538842L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyWithFormatting(Ljava/lang/String;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void applyWithFormatting__563894589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-563894589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFullyFiltered()Z", cancellable = true)
    private void isFullyFiltered_925178049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(925178049L))
            info.setReturnValue(true);
    }


}
