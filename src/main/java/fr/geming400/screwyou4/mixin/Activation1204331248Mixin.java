package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestEnvironmentDefinition.Activation.class)
public class Activation1204331248Mixin {
        @Inject(at = @At("HEAD"), method = "teardown()V", cancellable = true)
    private void teardown__503683553(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-503683553L))
            info.cancel();
    }


}
