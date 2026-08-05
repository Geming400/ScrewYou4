package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.control.JumpControl.class)
public class JumpControl1463130081Mixin {
        @Inject(at = @At("HEAD"), method = "jump()V", cancellable = true)
    private void jump_2095257382(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2095257382L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1333446423(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1333446423L))
            info.cancel();
    }


}
