package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.numbers.BlankFormat.class)
public class BlankFormat_1759337283Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/chat/numbers/NumberFormatType;", cancellable = true)
    private void type_781861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(781861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "format(I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void format__1936396346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1936396346L))
            info.setReturnValue(null);
    }


}
