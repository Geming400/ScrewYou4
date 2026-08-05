package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.numbers.FixedFormat.class)
public class FixedFormat_164504851Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/chat/numbers/NumberFormatType;", cancellable = true)
    private void type__1594050571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1594050571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void value__2012404315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2012404315L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1550017109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1550017109L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__970955125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-970955125L))
            info.setReturnValue("}zegIw>M AE闾!!o0()G7D}3芸 iX");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_202767592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202767592L))
            info.setReturnValue(1851562779);
    }

    @Inject(at = @At("HEAD"), method = "format(I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void format_763738518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(763738518L))
            info.setReturnValue(null);
    }


}
