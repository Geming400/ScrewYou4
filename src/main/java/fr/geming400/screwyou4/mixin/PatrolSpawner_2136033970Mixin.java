package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.PatrolSpawner.class)
public class PatrolSpawner_2136033970Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;Z)V", cancellable = true)
    private void tick_1913215421(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1913215421L))
            info.cancel();
    }


}
