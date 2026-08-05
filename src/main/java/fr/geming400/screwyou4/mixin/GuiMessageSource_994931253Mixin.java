package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.GuiMessageSource.class)
public class GuiMessageSource_994931253Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/multiplayer/chat/GuiMessageSource;", cancellable = true)
    private static void values__961324616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961324616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/chat/GuiMessageSource;", cancellable = true)
    private static void valueOf__2021497793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2021497793L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.GuiMessageSource.SYSTEM_CLIENT);
    }


}
