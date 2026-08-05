package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.tutorial.OpenInventoryTutorialStep.class)
public class OpenInventoryTutorialStep915242062Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_129414356(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(129414356L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_785558404(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(785558404L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onOpenInventory()V", cancellable = true)
    private void onOpenInventory_1379777614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1379777614L))
            info.cancel();
    }


}
