package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.tutorial.FindTreeTutorialStepInstance.class)
public class FindTreeTutorialStepInstance_47351130Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_85625868(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(85625868L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_85625868(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(85625868L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onLookAt(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/phys/HitResult;)V", cancellable = true)
    private void onLookAt__616804334(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-616804334L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGetItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void onGetItem_1781882417(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1781882417L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasPunchedTreesPreviously(Lnet/minecraft/client/player/LocalPlayer;)Z", cancellable = true)
    private static void hasPunchedTreesPreviously_1598961457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1598961457L))
            info.setReturnValue(null);
    }


}
