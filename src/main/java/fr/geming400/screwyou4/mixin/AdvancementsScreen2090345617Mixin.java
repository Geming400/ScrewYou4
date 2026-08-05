package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.advancements.AdvancementsScreen.class)
public class AdvancementsScreen2090345617Mixin {
        @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_2128620356(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2128620356L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_2128620356(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2128620356L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_2128620356(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2128620356L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onRemoveAdvancementTask(Lnet/minecraft/advancements/AdvancementNode;)V", cancellable = true)
    private void onRemoveAdvancementTask__162744775(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-162744775L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onAddAdvancementTask(Lnet/minecraft/advancements/AdvancementNode;)V", cancellable = true)
    private void onAddAdvancementTask__162744775(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-162744775L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onRemoveAdvancementRoot(Lnet/minecraft/advancements/AdvancementNode;)V", cancellable = true)
    private void onRemoveAdvancementRoot__162744775(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-162744775L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onAddAdvancementRoot(Lnet/minecraft/advancements/AdvancementNode;)V", cancellable = true)
    private void onAddAdvancementRoot__162744775(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-162744775L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onAdvancementsCleared()V", cancellable = true)
    private void onAdvancementsCleared_2128620356(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2128620356L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1130658245(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1130658245L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAdvancementWidget(Lnet/minecraft/advancements/AdvancementNode;)Lnet/minecraft/client/gui/screens/advancements/AdvancementWidget;", cancellable = true)
    private void getAdvancementWidget__1638463050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1638463050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSelectedTabChanged(Lnet/minecraft/advancements/AdvancementHolder;)V", cancellable = true)
    private void onSelectedTabChanged_1066342351(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1066342351L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractWindow(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractWindow__989447847(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-989447847L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_475686739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(475686739L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseReleased(Lnet/minecraft/client/input/MouseButtonEvent;)Z", cancellable = true)
    private void mouseReleased__1980999385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1980999385L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseScrolled(DDDD)Z", cancellable = true)
    private void mouseScrolled__1004710072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1004710072L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mouseDragged(Lnet/minecraft/client/input/MouseButtonEvent;DD)Z", cancellable = true)
    private void mouseDragged__1326613529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1326613529L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_1173709903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1173709903L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onUpdateAdvancementProgress(Lnet/minecraft/advancements/AdvancementNode;Lnet/minecraft/advancements/AdvancementProgress;)V", cancellable = true)
    private void onUpdateAdvancementProgress__33013789(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-33013789L))
            info.cancel();
    }


}
