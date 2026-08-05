package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fox.Fox.FoxLookControl.class)
public class FoxLookControl_1840943618Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1711259959(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1711259959L))
            info.cancel();
    }


}
