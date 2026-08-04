package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.PhantomSpawner.class)
public class PhantomSpawner_1503401023Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;Z)V", cancellable = true)
    private void tick_1280582474(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1280582474L))
            info.cancel();
    }


}
