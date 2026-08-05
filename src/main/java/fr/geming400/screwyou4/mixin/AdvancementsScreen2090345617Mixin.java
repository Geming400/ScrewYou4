package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.advancements.AdvancementsScreen.class)
public class AdvancementsScreen2090345617Mixin {
        @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_1651265252(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1651265252L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose__978606197(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-978606197L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1960661959(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1960661959L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSelectedTabChanged(Lnet/minecraft/advancements/AdvancementHolder;)V", cancellable = true)
    private void onSelectedTabChanged_1872652438(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1872652438L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractWindow(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractWindow__1178791318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1178791318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAdvancementWidget(Lnet/minecraft/advancements/AdvancementNode;)Lnet/minecraft/client/gui/screens/advancements/AdvancementWidget;", cancellable = true)
    private void getAdvancementWidget__1589867288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1589867288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mouseScrolled(DDDD)Z", cancellable = true)
    private void mouseScrolled__1376905609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1376905609L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseReleased(Lnet/minecraft/client/input/MouseButtonEvent;)Z", cancellable = true)
    private void mouseReleased__1620485719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1620485719L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mouseDragged(Lnet/minecraft/client/input/MouseButtonEvent;DD)Z", cancellable = true)
    private void mouseDragged_47963284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(47963284L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_1549839441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1549839441L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onUpdateAdvancementProgress(Lnet/minecraft/advancements/AdvancementNode;Lnet/minecraft/advancements/AdvancementProgress;)V", cancellable = true)
    private void onUpdateAdvancementProgress_1489460734(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1489460734L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__1217742037(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1217742037L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onAddAdvancementRoot(Lnet/minecraft/advancements/AdvancementNode;)V", cancellable = true)
    private void onAddAdvancementRoot_1241445113(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1241445113L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onRemoveAdvancementTask(Lnet/minecraft/advancements/AdvancementNode;)V", cancellable = true)
    private void onRemoveAdvancementTask__48653897(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-48653897L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onAdvancementsCleared()V", cancellable = true)
    private void onAdvancementsCleared_358283082(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(358283082L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onRemoveAdvancementRoot(Lnet/minecraft/advancements/AdvancementNode;)V", cancellable = true)
    private void onRemoveAdvancementRoot__716765190(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-716765190L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onAddAdvancementTask(Lnet/minecraft/advancements/AdvancementNode;)V", cancellable = true)
    private void onAddAdvancementTask_1909556406(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1909556406L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_2059291986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2059291986L))
            info.setReturnValue(true);
    }


}
