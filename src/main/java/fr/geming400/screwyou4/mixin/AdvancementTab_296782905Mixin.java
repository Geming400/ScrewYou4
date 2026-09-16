package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.advancements.AdvancementTab.class)
public class AdvancementTab_296782905Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/client/gui/screens/advancements/AdvancementTabType;", cancellable = true)
    private void getType_750163319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(750163319L))
            info.setReturnValue(net.minecraft.client.gui.screens.advancements.AdvancementTabType.BELOW);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/gui/screens/advancements/AdvancementsScreen;ILnet/minecraft/advancements/AdvancementNode;)Lnet/minecraft/client/gui/screens/advancements/AdvancementTab;", cancellable = true)
    private static void create_1782966209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1782966209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIndex()I", cancellable = true)
    private void getIndex_693150850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(693150850L))
            info.setReturnValue(1373192291);
    }

    @Inject(at = @At("HEAD"), method = "tick(II)V", cancellable = true)
    private void tick_1101641166(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1101641166L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractTooltips(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractTooltips__177495375(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-177495375L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canScrollHorizontally()Z", cancellable = true)
    private void canScrollHorizontally__323157343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-323157343L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canScrollVertically()Z", cancellable = true)
    private void canScrollVertically__937428017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-937428017L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addAdvancement(Lnet/minecraft/advancements/AdvancementNode;)V", cancellable = true)
    private void addAdvancement_1616726593(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1616726593L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isMouseOver(IIDD)Z", cancellable = true)
    private void isMouseOver_646558560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(646558560L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractIcon(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractIcon_839405082(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(839405082L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRootNode()Lnet/minecraft/advancements/AdvancementNode;", cancellable = true)
    private void getRootNode_679530406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679530406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTitle()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTitle_701459181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701459181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractContents(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractContents_466219387(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(466219387L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDisplay()Lnet/minecraft/advancements/DisplayInfo;", cancellable = true)
    private void getDisplay__157962006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-157962006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractTab(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIIIZ)V", cancellable = true)
    private void extractTab__2115207988(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2115207988L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWidget(Lnet/minecraft/advancements/AdvancementHolder;)Lnet/minecraft/client/gui/screens/advancements/AdvancementWidget;", cancellable = true)
    private void getWidget_675827577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(675827577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getScreen()Lnet/minecraft/client/gui/screens/advancements/AdvancementsScreen;", cancellable = true)
    private void getScreen__1025062087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1025062087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scroll(DD)V", cancellable = true)
    private void scroll__2052965890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2052965890L))
            info.cancel();
    }


}
