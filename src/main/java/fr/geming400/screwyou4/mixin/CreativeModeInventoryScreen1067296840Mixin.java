package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen.class)
public class CreativeModeInventoryScreen1067296840Mixin {
        @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_628216475(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(628216475L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize__50319641(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-50319641L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "preeditUpdated(Lnet/minecraft/client/input/PreeditEvent;)Z", cancellable = true)
    private void preeditUpdated__110640094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-110640094L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "keyReleased(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyReleased_962611650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(962611650L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "containerTick()V", cancellable = true)
    private void containerTick__1886704643(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1886704643L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInventoryOpen()Z", cancellable = true)
    private void isInventoryOpen__744401213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-744401213L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mouseDragged(Lnet/minecraft/client/input/MouseButtonEvent;DD)Z", cancellable = true)
    private void mouseDragged__975085493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-975085493L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mouseReleased(Lnet/minecraft/client/input/MouseButtonEvent;)Z", cancellable = true)
    private void mouseReleased_1651432800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1651432800L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseScrolled(DDDD)Z", cancellable = true)
    private void mouseScrolled_1895012910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1895012910L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "handleHotbarLoadOrSave(Lnet/minecraft/client/Minecraft;IZZ)V", cancellable = true)
    private static void handleHotbarLoadOrSave__1620405426(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1620405426L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_526790664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(526790664L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_2054176482(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2054176482L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTooltipFromContainerItem(Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;", cancellable = true)
    private void getTooltipFromContainerItem__880741872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-880741872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "charTyped(Lnet/minecraft/client/input/CharacterEvent;)Z", cancellable = true)
    private void charTyped__873411644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873411644L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_1036243209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1036243209L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__1826215923(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1826215923L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showsActiveEffects()Z", cancellable = true)
    private void showsActiveEffects_1195341849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1195341849L))
            info.setReturnValue(false);
    }


}
