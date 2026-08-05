package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.tutorial.MovementTutorialStepInstance.class)
public class MovementTutorialStepInstance1717176414Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_931348708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(931348708L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1587492756(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1587492756L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onMouse(DD)V", cancellable = true)
    private void onMouse__1453053749(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1453053749L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onInput(Lnet/minecraft/client/player/ClientInput;)V", cancellable = true)
    private void onInput_310294386(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(310294386L))
            info.cancel();
    }


}
