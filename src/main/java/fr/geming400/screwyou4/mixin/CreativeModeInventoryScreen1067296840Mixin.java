package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen.class)
public class CreativeModeInventoryScreen1067296840Mixin {
        @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_1105571579(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1105571579L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize_71417371(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(71417371L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyReleased(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyReleased_150661126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(150661126L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "preeditUpdated(Lnet/minecraft/client/input/PreeditEvent;)Z", cancellable = true)
    private void preeditUpdated__693069868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-693069868L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_150661126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(150661126L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "charTyped(Lnet/minecraft/client/input/CharacterEvent;)Z", cancellable = true)
    private void charTyped__1019344624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1019344624L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_107609468(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(107609468L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "containerTick()V", cancellable = true)
    private void containerTick_1105571579(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1105571579L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInventoryOpen()Z", cancellable = true)
    private void isInventoryOpen_1105575423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1105575423L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleHotbarLoadOrSave(Lnet/minecraft/client/Minecraft;IZZ)V", cancellable = true)
    private static void handleHotbarLoadOrSave_1616126266(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1616126266L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseScrolled(DDDD)Z", cancellable = true)
    private void mouseScrolled__2027758849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2027758849L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mouseReleased(Lnet/minecraft/client/input/MouseButtonEvent;)Z", cancellable = true)
    private void mouseReleased_1290919134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290919134L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked__547362038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-547362038L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mouseDragged(Lnet/minecraft/client/input/MouseButtonEvent;DD)Z", cancellable = true)
    private void mouseDragged_1945304990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1945304990L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_107609468(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(107609468L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showsActiveEffects()Z", cancellable = true)
    private void showsActiveEffects_1105575423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1105575423L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getTooltipFromContainerItem(Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;", cancellable = true)
    private void getTooltipFromContainerItem_1716098483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1716098483L))
            info.setReturnValue(null);
    }


}
