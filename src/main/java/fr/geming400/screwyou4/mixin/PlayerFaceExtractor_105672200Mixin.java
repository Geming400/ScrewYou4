package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.PlayerFaceExtractor.class)
public class PlayerFaceExtractor_105672200Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/resources/Identifier;IIIZZI)V", cancellable = true)
    private static void extractRenderState__685942417(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-685942417L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/world/entity/player/PlayerSkin;IIII)V", cancellable = true)
    private static void extractRenderState_1289573605(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1289573605L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/world/entity/player/PlayerSkin;III)V", cancellable = true)
    private static void extractRenderState__1935231048(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1935231048L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/world/item/component/ResolvableProfile;III)V", cancellable = true)
    private static void extractRenderState_1529196768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1529196768L))
            info.cancel();
    }


}
