package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.GuiMessageTag.Icon.class)
public class Icon323471323Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/multiplayer/chat/GuiMessageTag$Icon;", cancellable = true)
    private static void values_1910773655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1910773655L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/chat/GuiMessageTag$Icon;", cancellable = true)
    private static void valueOf_991599710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(991599710L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.GuiMessageTag.Icon.CHAT_MODIFIED);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractRenderState__892414339(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-892414339L))
            info.cancel();
    }


}
