package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.sensing.Sensing.class)
public class Sensing1180139453Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1050455795(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1050455795L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasLineOfSight(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void hasLineOfSight__628885051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-628885051L))
            info.setReturnValue(true);
    }


}
