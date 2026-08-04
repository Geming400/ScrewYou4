package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.numbers.NumberFormatTypes.class)
public class NumberFormatTypes_1163898741Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/network/chat/numbers/NumberFormatType;", cancellable = true)
    private static void bootstrap_1061705261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1061705261L))
            info.setReturnValue(null);
    }


}
