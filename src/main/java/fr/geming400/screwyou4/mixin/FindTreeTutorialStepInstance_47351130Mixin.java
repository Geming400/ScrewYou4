package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.tutorial.FindTreeTutorialStepInstance.class)
public class FindTreeTutorialStepInstance_47351130Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear__738476577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-738476577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick__82332529(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-82332529L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGetItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void onGetItem_1851015367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1851015367L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onLookAt(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/phys/HitResult;)V", cancellable = true)
    private void onLookAt_1899773697(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1899773697L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasPunchedTreesPreviously(Lnet/minecraft/client/player/LocalPlayer;)Z", cancellable = true)
    private static void hasPunchedTreesPreviously_1386105623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1386105623L))
            info.setReturnValue(false);
    }


}
