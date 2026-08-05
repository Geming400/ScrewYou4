package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.advancements.AdvancementTab.class)
public class AdvancementTab_296782905Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/client/gui/screens/advancements/AdvancementTabType;", cancellable = true)
    private void getType__118316601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-118316601L))
            info.setReturnValue(net.minecraft.client.gui.screens.advancements.AdvancementTabType.LEFT);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/gui/screens/advancements/AdvancementsScreen;ILnet/minecraft/advancements/AdvancementNode;)Lnet/minecraft/client/gui/screens/advancements/AdvancementTab;", cancellable = true)
    private static void create__1761652419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1761652419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIndex()I", cancellable = true)
    private void getIndex_335045150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(335045150L))
            info.setReturnValue(-937394725);
    }

    @Inject(at = @At("HEAD"), method = "tick(II)V", cancellable = true)
    private void tick__699096565(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-699096565L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractContents(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractContents_1511956736(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1511956736L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTitle()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTitle__1880126261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1880126261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addAdvancement(Lnet/minecraft/advancements/AdvancementNode;)V", cancellable = true)
    private void addAdvancement__1956307488(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1956307488L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractTooltips(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractTooltips_1511956736(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1511956736L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canScrollHorizontally()Z", cancellable = true)
    private void canScrollHorizontally_335061487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(335061487L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canScrollVertically()Z", cancellable = true)
    private void canScrollVertically_335061487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(335061487L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRootNode()Lnet/minecraft/advancements/AdvancementNode;", cancellable = true)
    private void getRootNode__1235104724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1235104724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWidget(Lnet/minecraft/advancements/AdvancementHolder;)Lnet/minecraft/client/gui/screens/advancements/AdvancementWidget;", cancellable = true)
    private void getWidget__2024135949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2024135949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDisplay()Lnet/minecraft/advancements/DisplayInfo;", cancellable = true)
    private void getDisplay__395903394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-395903394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractTab(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIIIZ)V", cancellable = true)
    private void extractTab_715232672(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(715232672L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getScreen()Lnet/minecraft/client/gui/screens/advancements/AdvancementsScreen;", cancellable = true)
    private void getScreen__365065897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-365065897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scroll(DD)V", cancellable = true)
    private void scroll__846859925(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-846859925L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isMouseOver(IIDD)Z", cancellable = true)
    private void isMouseOver_1763362703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1763362703L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractIcon(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractIcon_1511956736(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1511956736L))
            info.cancel();
    }


}
