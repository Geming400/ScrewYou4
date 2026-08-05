package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.tutorial.Tutorial.class)
public class Tutorial_568682514Mixin {
        @Inject(at = @At("HEAD"), method = "key(Ljava/lang/String;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void key_838834609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(838834609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__1057482846(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1057482846L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_2145785858(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2145785858L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_438998855(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(438998855L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onOpenInventory()V", cancellable = true)
    private void onOpenInventory_1033218065(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1033218065L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSurvival()Z", cancellable = true)
    private void isSurvival__1416683456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1416683456L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMinecraft()Lnet/minecraft/client/Minecraft;", cancellable = true)
    private void getMinecraft_1723353657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1723353657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onDestroyBlock(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;F)V", cancellable = true)
    private void onDestroyBlock_702471264(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(702471264L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onLookAt(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/phys/HitResult;)V", cancellable = true)
    private void onLookAt__1873862215(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1873862215L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onMouse(DD)V", cancellable = true)
    private void onMouse_1693419646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1693419646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGetItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void onGetItem__1922620545(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1922620545L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onInput(Lnet/minecraft/client/player/ClientInput;)V", cancellable = true)
    private void onInput__838199515(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-838199515L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onInventoryAction(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/ClickAction;)V", cancellable = true)
    private void onInventoryAction__2108792054(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2108792054L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setStep(Lnet/minecraft/client/tutorial/TutorialSteps;)V", cancellable = true)
    private void setStep_733621633(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(733621633L))
            info.cancel();
    }


}
