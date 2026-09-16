package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.SpriteIconButton.Builder.class)
public class Builder1804471369Mixin {
        @Inject(at = @At("HEAD"), method = "size(II)Lnet/minecraft/client/gui/components/SpriteIconButton$Builder;", cancellable = true)
    private void size__713776356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-713776356L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/gui/components/SpriteIconButton;", cancellable = true)
    private void build_1545714144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1545714144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width(I)Lnet/minecraft/client/gui/components/SpriteIconButton$Builder;", cancellable = true)
    private void width__424888996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-424888996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withTootip()Lnet/minecraft/client/gui/components/SpriteIconButton$Builder;", cancellable = true)
    private void withTootip_1494544040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1494544040L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spriteOffset(II)Lnet/minecraft/client/gui/components/SpriteIconButton$Builder;", cancellable = true)
    private void spriteOffset__1408089261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1408089261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tooltip(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/client/gui/components/SpriteIconButton$Builder;", cancellable = true)
    private void tooltip__779962582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-779962582L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprite(Lnet/minecraft/resources/Identifier;II)Lnet/minecraft/client/gui/components/SpriteIconButton$Builder;", cancellable = true)
    private void sprite__236808232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-236808232L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprite(Lnet/minecraft/client/gui/components/WidgetSprites;II)Lnet/minecraft/client/gui/components/SpriteIconButton$Builder;", cancellable = true)
    private void sprite__2144873740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2144873740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "narration(Lnet/minecraft/client/gui/components/Button$CreateNarration;)Lnet/minecraft/client/gui/components/SpriteIconButton$Builder;", cancellable = true)
    private void narration__2100266889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2100266889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "switchToLoadingAfterPress()Lnet/minecraft/client/gui/components/SpriteIconButton$Builder;", cancellable = true)
    private void switchToLoadingAfterPress__274626865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-274626865L))
            info.setReturnValue(null);
    }


}
