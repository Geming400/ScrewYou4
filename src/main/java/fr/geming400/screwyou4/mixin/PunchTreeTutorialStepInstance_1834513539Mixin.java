package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.tutorial.PunchTreeTutorialStepInstance.class)
public class PunchTreeTutorialStepInstance_1834513539Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1872788277(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1872788277L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1872788277(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1872788277L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGetItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void onGetItem__725922470(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-725922470L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onDestroyBlock(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;F)V", cancellable = true)
    private void onDestroyBlock_1267481155(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1267481155L))
            info.cancel();
    }


}
