package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.tutorial.MovementTutorialStepInstance.class)
public class MovementTutorialStepInstance1717176414Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1755451153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1755451153L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1755451153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1755451153L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onInput(Lnet/minecraft/client/player/ClientInput;)V", cancellable = true)
    private void onInput__1740644985(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1740644985L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onMouse(DD)V", cancellable = true)
    private void onMouse_573533585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(573533585L))
            info.cancel();
    }


}
