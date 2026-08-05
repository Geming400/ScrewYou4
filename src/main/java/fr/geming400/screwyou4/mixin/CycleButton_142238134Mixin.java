package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.CycleButton.class)
public class CycleButton_142238134Mixin {
        @Inject(at = @At("HEAD"), method = "getValue()Ljava/lang/Object;", cancellable = true)
    private void getValue_2001430352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2001430352L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder(Ljava/util/function/Function;Ljava/lang/Object;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private static void builder__1305266181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1305266181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder(Ljava/util/function/Function;Ljava/util/function/Supplier;)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private static void builder__719185693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-719185693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setValue(Ljava/lang/Object;)V", cancellable = true)
    private void setValue_1527746052(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1527746052L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "booleanBuilder(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;Z)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private static void booleanBuilder__960790215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-960790215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onOffBuilder(Z)Lnet/minecraft/client/gui/components/CycleButton$Builder;", cancellable = true)
    private static void onOffBuilder__616061087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-616061087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetValue()V", cancellable = true)
    private void resetValue_180512872(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(180512872L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseScrolled(DDDD)Z", cancellable = true)
    private void mouseScrolled_1342149740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1342149740L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "updateWidgetNarration(Lnet/minecraft/client/gui/narration/NarrationElementOutput;)V", cancellable = true)
    private void updateWidgetNarration_1403897619(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1403897619L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPress(Lnet/minecraft/client/input/InputWithModifiers;)V", cancellable = true)
    private void onPress_1080021790(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1080021790L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createDefaultNarrationMessage()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void createDefaultNarrationMessage_2029201216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2029201216L))
            info.setReturnValue(null);
    }


}
