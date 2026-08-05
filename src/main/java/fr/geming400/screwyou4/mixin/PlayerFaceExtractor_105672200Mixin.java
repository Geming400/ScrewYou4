package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.PlayerFaceExtractor.class)
public class PlayerFaceExtractor_105672200Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/resources/Identifier;IIIZZI)V", cancellable = true)
    private static void extractRenderState__663883447(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-663883447L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/world/entity/player/PlayerSkin;IIII)V", cancellable = true)
    private static void extractRenderState__1645382977(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1645382977L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/world/entity/player/PlayerSkin;III)V", cancellable = true)
    private static void extractRenderState__1198623074(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1198623074L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/world/item/component/ResolvableProfile;III)V", cancellable = true)
    private static void extractRenderState__1343542842(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1343542842L))
            info.cancel();
    }


}
