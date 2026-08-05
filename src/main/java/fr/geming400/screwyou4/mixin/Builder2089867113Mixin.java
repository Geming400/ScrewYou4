package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.CycleButton.Builder.class)
public class Builder2089867113Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/network/chat/Component;Lnet/minecraft/client/gui/components/CycleButton$OnValueChange;)Lnet/minecraft/client/gui/components/CycleButton;", cancellable = true)
    private void create_655195404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(655195404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(IIIILnet/minecraft/network/chat/Component;)Lnet/minecraft/client/gui/components/CycleButton;", cancellable = true)
    private void create__1365865570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1365865570L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(IIIILnet/minecraft/network/chat/Component;Lnet/minecraft/client/gui/components/CycleButton$OnValueChange;)Lnet/minecraft/client/gui/components/CycleButton;", cancellable = true)
    private void create_1337003724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1337003724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withValues(Ljava/util/function/BooleanSupplier;Ljava/util/List;Ljava/util/List;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private void withValues__96130937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-96130937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withValues(Ljava/util/List;Ljava/util/List;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private void withValues__752593035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-752593035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withValues([Ljava/lang/Object;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private void withValues_648020714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(648020714L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withValues(Ljava/util/Collection;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private void withValues__91362620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-91362620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withValues(Lnet/minecraft/client/gui/components/CycleButton$ValueListSupplier;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private void withValues__523297520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-523297520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displayState(Lnet/minecraft/client/gui/components/CycleButton$DisplayState;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private void displayState__1849939502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1849939502L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withCustomNarration(Ljava/util/function/Function;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private void withCustomNarration_189512987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(189512987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displayOnlyValue()Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private void displayOnlyValue__1163701741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1163701741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withTooltip(Lnet/minecraft/client/OptionInstance$TooltipSupplier;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private void withTooltip_530722053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530722053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSprite(Lnet/minecraft/client/gui/components/CycleButton$SpriteSupplier;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private void withSprite__1119529072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1119529072L))
            info.setReturnValue(null);
    }


}
