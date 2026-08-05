package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.layouts.HeaderAndFooterLayout.class)
public class HeaderAndFooterLayout_224312319Mixin {
        @Inject(at = @At("HEAD"), method = "getY()I", cancellable = true)
    private void getY_1127749633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1127749633L))
            info.setReturnValue(1972867405);
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX_1099120482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1099120482L))
            info.setReturnValue(-2137831186);
    }

    @Inject(at = @At("HEAD"), method = "setHeaderHeight(I)V", cancellable = true)
    private void setHeaderHeight__2130433472(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2130433472L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addToHeader(Lnet/minecraft/client/gui/layouts/LayoutElement;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addToHeader__1117660602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1117660602L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToHeader(Lnet/minecraft/client/gui/layouts/LayoutElement;Ljava/util/function/Consumer;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addToHeader__1646740520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1646740520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFooterHeight(I)V", cancellable = true)
    private void setFooterHeight_305387598(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(305387598L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addToContents(Lnet/minecraft/client/gui/layouts/LayoutElement;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addToContents_75583827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(75583827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToContents(Lnet/minecraft/client/gui/layouts/LayoutElement;Ljava/util/function/Consumer;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addToContents__878355477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-878355477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToFooter(Lnet/minecraft/client/gui/layouts/LayoutElement;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addToFooter_2145668692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2145668692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToFooter(Lnet/minecraft/client/gui/layouts/LayoutElement;Ljava/util/function/Consumer;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addToFooter__1983108470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1983108470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFooterHeight()I", cancellable = true)
    private void getFooterHeight_1252596684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1252596684L))
            info.setReturnValue(-1769914481);
    }

    @Inject(at = @At("HEAD"), method = "addTitleHeader(Lnet/minecraft/network/chat/Component;Lnet/minecraft/client/gui/Font;)V", cancellable = true)
    private void addTitleHeader_1832329253(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1832329253L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "arrangeElements()V", cancellable = true)
    private void arrangeElements__608868402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-608868402L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitChildren(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitChildren_611660357(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(611660357L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeChildren()V", cancellable = true)
    private void removeChildren_1444248046(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1444248046L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth__1713584172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1713584172L))
            info.setReturnValue(437116878);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight__1501304857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1501304857L))
            info.setReturnValue(-1853626539);
    }

    @Inject(at = @At("HEAD"), method = "setX(I)V", cancellable = true)
    private void setX__756813088(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-756813088L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setY(I)V", cancellable = true)
    private void setY_130690593(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(130690593L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeaderHeight()I", cancellable = true)
    private void getHeaderHeight_342737818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(342737818L))
            info.setReturnValue(-595378107);
    }

    @Inject(at = @At("HEAD"), method = "getContentHeight()I", cancellable = true)
    private void getContentHeight__85253926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-85253926L))
            info.setReturnValue(-885062652);
    }


}
