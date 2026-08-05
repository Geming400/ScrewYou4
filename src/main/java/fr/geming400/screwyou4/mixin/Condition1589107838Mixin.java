package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestSequence.Condition.class)
public class Condition1589107838Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(I)V", cancellable = true)
    private void trigger__1261637790(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1261637790L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertTriggeredThisTick()V", cancellable = true)
    private void assertTriggeredThisTick_1571264133(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1571264133L))
            info.cancel();
    }


}
