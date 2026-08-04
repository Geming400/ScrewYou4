package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.KeyMapping.class)
public class KeyMapping_1937956509Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_802496037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(802496037L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Ljava/lang/String;)Lnet/minecraft/client/KeyMapping;", cancellable = true)
    private static void get__905631517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-905631517L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lnet/minecraft/client/KeyMapping;)I", cancellable = true)
    private void compareTo_1703253146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703253146L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo__971386402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-971386402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void matches_1021320794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1021320794L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lcom/mojang/blaze3d/platform/InputConstants$Key;)Z", cancellable = true)
    private void matches__910042991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-910042991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lcom/mojang/blaze3d/platform/InputConstants$Key;Z)V", cancellable = true)
    private static void set__407701037(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-407701037L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDefault()Z", cancellable = true)
    private void isDefault_1976235091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1976235091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAll()V", cancellable = true)
    private static void setAll_1976231495(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1976231495L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setKey(Lcom/mojang/blaze3d/platform/InputConstants$Key;)V", cancellable = true)
    private void setKey__910046835(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-910046835L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "same(Lnet/minecraft/client/KeyMapping;)Z", cancellable = true)
    private void same_1703269483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703269483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCategory()Lnet/minecraft/client/KeyMapping$Category;", cancellable = true)
    private void getCategory__636139961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-636139961L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "restoreToggleStatesOnScreenClosed()V", cancellable = true)
    private static void restoreToggleStatesOnScreenClosed_1976231495(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1976231495L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createNameSupplier(Ljava/lang/String;)Ljava/util/function/Supplier;", cancellable = true)
    private static void createNameSupplier__707748385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-707748385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTranslatedKeyMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTranslatedKeyMessage__238952657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-238952657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "consumeClick()Z", cancellable = true)
    private void consumeClick_1976235091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1976235091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matchesMouse(Lnet/minecraft/client/input/MouseButtonEvent;)Z", cancellable = true)
    private void matchesMouse__2133388494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133388494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultKey()Lcom/mojang/blaze3d/platform/InputConstants$Key;", cancellable = true)
    private void getDefaultKey_1227227545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1227227545L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetMapping()V", cancellable = true)
    private static void resetMapping_1976231495(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1976231495L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetToggleKeys()V", cancellable = true)
    private static void resetToggleKeys_1976231495(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1976231495L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveString()Ljava/lang/String;", cancellable = true)
    private void saveString_802496037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(802496037L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDown()Z", cancellable = true)
    private void isDown_1976235091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1976235091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "releaseAll()V", cancellable = true)
    private static void releaseAll_1976231495(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1976231495L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "click(Lcom/mojang/blaze3d/platform/InputConstants$Key;)V", cancellable = true)
    private static void click__910046587(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-910046587L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDown(Z)V", cancellable = true)
    private void setDown__1127393959(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1127393959L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isUnbound()Z", cancellable = true)
    private void isUnbound_1976235091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1976235091L))
            info.setReturnValue(null);
    }


}
