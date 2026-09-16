package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.CycleButton.class)
public class CycleButton_142238134Mixin {
        @Inject(at = @At("HEAD"), method = "getValue()Ljava/lang/Object;", cancellable = true)
    private void getValue_1396527307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1396527307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder(Ljava/util/function/Function;Ljava/util/function/Supplier;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private static void builder_370069224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370069224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder(Ljava/util/function/Function;Ljava/lang/Object;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private static void builder_2088506134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2088506134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setValue(Ljava/lang/Object;)V", cancellable = true)
    private void setValue__129747211(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-129747211L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetValue()V", cancellable = true)
    private void resetValue__1145636794(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1145636794L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateWidgetNarration(Lnet/minecraft/client/gui/narration/NarrationElementOutput;)V", cancellable = true)
    private void updateWidgetNarration__1481626424(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1481626424L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseScrolled(DDDD)Z", cancellable = true)
    private void mouseScrolled_969954203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(969954203L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "booleanBuilder(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;Z)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private static void booleanBuilder_605447116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(605447116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onOffBuilder(Z)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private static void onOffBuilder__1880261492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1880261492L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDefaultNarrationMessage()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void createDefaultNarrationMessage__1784433994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1784433994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onPress(Lnet/minecraft/client/input/InputWithModifiers;)V", cancellable = true)
    private void onPress__813399358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-813399358L))
            info.cancel();
    }


}
