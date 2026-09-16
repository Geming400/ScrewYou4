package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.KeyMapping.class)
public class KeyMapping_1937956509Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_49109606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(49109606L))
            info.setReturnValue("?ly");
    }

    @Inject(at = @At("HEAD"), method = "get(Ljava/lang/String;)Lnet/minecraft/client/KeyMapping;", cancellable = true)
    private static void get__579956531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-579956531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lnet/minecraft/client/KeyMapping;)I", cancellable = true)
    private void compareTo__1111128358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1111128358L))
            info.setReturnValue(701907546);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo_45852574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(45852574L))
            info.setReturnValue(1667350159);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void matches__1714653235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1714653235L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lcom/mojang/blaze3d/platform/InputConstants$Key;)Z", cancellable = true)
    private void matches__1734268610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1734268610L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "set(Lcom/mojang/blaze3d/platform/InputConstants$Key;Z)V", cancellable = true)
    private static void set__36153163(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-36153163L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDefault()Z", cancellable = true)
    private void isDefault_473354492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(473354492L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setAll()V", cancellable = true)
    private static void setAll_1377560520(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1377560520L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setKey(Lcom/mojang/blaze3d/platform/InputConstants$Key;)V", cancellable = true)
    private void setKey__331760880(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-331760880L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "same(Lnet/minecraft/client/KeyMapping;)Z", cancellable = true)
    private void same_1708005457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1708005457L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matchesMouse(Lnet/minecraft/client/input/MouseButtonEvent;)Z", cancellable = true)
    private void matchesMouse__1619939868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1619939868L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getTranslatedKeyMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTranslatedKeyMessage__363428669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-363428669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetMapping()V", cancellable = true)
    private static void resetMapping_1822495016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1822495016L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "consumeClick()Z", cancellable = true)
    private void consumeClick__763989785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-763989785L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "resetToggleKeys()V", cancellable = true)
    private static void resetToggleKeys__209934704(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-209934704L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createNameSupplier(Ljava/lang/String;)Ljava/util/function/Supplier;", cancellable = true)
    private static void createNameSupplier_268094060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(268094060L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCategory()Lnet/minecraft/client/KeyMapping$Category;", cancellable = true)
    private void getCategory_1017517499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1017517499L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultKey()Lcom/mojang/blaze3d/platform/InputConstants$Key;", cancellable = true)
    private void getDefaultKey_1855591405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1855591405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "restoreToggleStatesOnScreenClosed()V", cancellable = true)
    private static void restoreToggleStatesOnScreenClosed__1163524756(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1163524756L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDown()Z", cancellable = true)
    private void isDown_69248743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(69248743L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "click(Lcom/mojang/blaze3d/platform/InputConstants$Key;)V", cancellable = true)
    private static void click__2008520195(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2008520195L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isUnbound()Z", cancellable = true)
    private void isUnbound_1948536632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1948536632L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "releaseAll()V", cancellable = true)
    private static void releaseAll_1318837869(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1318837869L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDown(Z)V", cancellable = true)
    private void setDown__1809318275(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1809318275L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveString()Ljava/lang/String;", cancellable = true)
    private void saveString_529109907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529109907L))
            info.setReturnValue("no");
    }


}
