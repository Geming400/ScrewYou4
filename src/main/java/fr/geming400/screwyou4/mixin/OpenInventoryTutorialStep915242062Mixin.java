package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.tutorial.OpenInventoryTutorialStep.class)
public class OpenInventoryTutorialStep915242062Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_953516801(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(953516801L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_953516801(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(953516801L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onOpenInventory()V", cancellable = true)
    private void onOpenInventory_953516801(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(953516801L))
            info.cancel();
    }


}
