package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.CycleButton.Builder.class)
public class Builder2089867113Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/network/chat/Component;Lnet/minecraft/client/gui/components/CycleButton$OnValueChange;)Lnet/minecraft/client/gui/components/CycleButton;", cancellable = true)
    private void create__107226360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-107226360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(IIIILnet/minecraft/network/chat/Component;)Lnet/minecraft/client/gui/components/CycleButton;", cancellable = true)
    private void create_389917474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(389917474L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(IIIILnet/minecraft/network/chat/Component;Lnet/minecraft/client/gui/components/CycleButton$OnValueChange;)Lnet/minecraft/client/gui/components/CycleButton;", cancellable = true)
    private void create_1470631624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470631624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSprite(Lnet/minecraft/client/gui/components/CycleButton$SpriteSupplier;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private void withSprite__1535157179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1535157179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withValues(Ljava/util/List;Ljava/util/List;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private void withValues_1741608685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1741608685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withValues([Ljava/lang/Object;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private void withValues_1988345970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1988345970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withValues(Ljava/util/Collection;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private void withValues__772612036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-772612036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withValues(Lnet/minecraft/client/gui/components/CycleButton$ValueListSupplier;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private void withValues_377399960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(377399960L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withValues(Ljava/util/function/BooleanSupplier;Ljava/util/List;Ljava/util/List;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private void withValues_2055687167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2055687167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withTooltip(Lnet/minecraft/client/OptionInstance$TooltipSupplier;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private void withTooltip__108986334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-108986334L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withCustomNarration(Ljava/util/function/Function;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private void withCustomNarration__1687876890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1687876890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displayOnlyValue()Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private void displayOnlyValue_21168752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(21168752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displayState(Lnet/minecraft/client/gui/components/CycleButton$DisplayState;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private void displayState_1539611523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1539611523L))
            info.setReturnValue(null);
    }


}
