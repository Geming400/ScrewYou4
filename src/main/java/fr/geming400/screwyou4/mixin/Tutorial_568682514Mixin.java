package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.tutorial.Tutorial.class)
public class Tutorial_568682514Mixin {
        @Inject(at = @At("HEAD"), method = "key(Ljava/lang/String;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void key__959943726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-959943726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_606957252(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(606957252L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_606957252(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(606957252L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_606957252(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(606957252L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setStep(Lnet/minecraft/client/tutorial/TutorialSteps;)V", cancellable = true)
    private void setStep__54499661(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-54499661L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSurvival()Z", cancellable = true)
    private void isSurvival_606961096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(606961096L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onGetItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void onGetItem__1991753495(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1991753495L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onInput(Lnet/minecraft/client/player/ClientInput;)V", cancellable = true)
    private void onInput_1405828410(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1405828410L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onOpenInventory()V", cancellable = true)
    private void onOpenInventory_606957252(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(606957252L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onLookAt(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/phys/HitResult;)V", cancellable = true)
    private void onLookAt__95472950(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-95472950L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onMouse(DD)V", cancellable = true)
    private void onMouse__574960316(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-574960316L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMinecraft()Lnet/minecraft/client/Minecraft;", cancellable = true)
    private void getMinecraft__623063358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623063358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onDestroyBlock(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;F)V", cancellable = true)
    private void onDestroyBlock_1650130(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1650130L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onInventoryAction(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/ClickAction;)V", cancellable = true)
    private void onInventoryAction_6467895(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(6467895L))
            info.cancel();
    }


}
