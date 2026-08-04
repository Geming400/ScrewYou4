package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestSequence.Condition.class)
public class Condition1589107838Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(I)V", cancellable = true)
    private void trigger__1491942486(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1491942486L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertTriggeredThisTick()V", cancellable = true)
    private void assertTriggeredThisTick_1627382577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1627382577L))
            info.cancel();
    }


}
