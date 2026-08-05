package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.SpriteIconButton.Builder.class)
public class Builder1804471369Mixin {
        @Inject(at = @At("HEAD"), method = "size(II)Lnet/minecraft/client/gui/components/SpriteIconButton$Builder;", cancellable = true)
    private void size__790809701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-790809701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/gui/components/SpriteIconButton;", cancellable = true)
    private void build__741639950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-741639950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width(I)Lnet/minecraft/client/gui/components/SpriteIconButton$Builder;", cancellable = true)
    private void width_196923618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(196923618L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprite(Lnet/minecraft/resources/Identifier;II)Lnet/minecraft/client/gui/components/SpriteIconButton$Builder;", cancellable = true)
    private void sprite_1772037651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1772037651L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprite(Lnet/minecraft/client/gui/components/WidgetSprites;II)Lnet/minecraft/client/gui/components/SpriteIconButton$Builder;", cancellable = true)
    private void sprite__23353511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-23353511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tooltip(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/client/gui/components/SpriteIconButton$Builder;", cancellable = true)
    private void tooltip__714080729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-714080729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "switchToLoadingAfterPress()Lnet/minecraft/client/gui/components/SpriteIconButton$Builder;", cancellable = true)
    private void switchToLoadingAfterPress_90238651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90238651L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spriteOffset(II)Lnet/minecraft/client/gui/components/SpriteIconButton$Builder;", cancellable = true)
    private void spriteOffset__790809701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-790809701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "narration(Lnet/minecraft/client/gui/components/Button$CreateNarration;)Lnet/minecraft/client/gui/components/SpriteIconButton$Builder;", cancellable = true)
    private void narration_1928155221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1928155221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withTootip()Lnet/minecraft/client/gui/components/SpriteIconButton$Builder;", cancellable = true)
    private void withTootip_90238651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90238651L))
            info.setReturnValue(null);
    }


}
