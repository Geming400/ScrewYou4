package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.language.FormattedBidiReorder.class)
public class FormattedBidiReorder856863485Mixin {
        @Inject(at = @At("HEAD"), method = "reorder(Lnet/minecraft/network/chat/FormattedText;Z)Lnet/minecraft/util/FormattedCharSequence;", cancellable = true)
    private static void reorder__119646708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-119646708L))
            info.setReturnValue(null);
    }


}
