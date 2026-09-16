package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.numbers.FixedFormat.class)
public class FixedFormat_164504851Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/chat/numbers/NumberFormatType;", cancellable = true)
    private void type__551008773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-551008773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void value__1185523242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1185523242L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__744121418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-744121418L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_934928375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(934928375L))
            info.setReturnValue("8pE>13T TKzp=\uD319XL#kEVtNp\" \u90B2-;VH\u9542_<N\u852D(nZ`D\u3D6D5ukM^j\uD26BY=\u98E3P");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_721856941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(721856941L))
            info.setReturnValue(64466970);
    }

    @Inject(at = @At("HEAD"), method = "format(I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void format_1360242125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1360242125L))
            info.setReturnValue(null);
    }


}
