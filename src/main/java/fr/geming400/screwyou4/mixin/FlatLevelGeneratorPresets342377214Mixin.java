package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.flat.FlatLevelGeneratorPresets.class)
public class FlatLevelGeneratorPresets342377214Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap__212228503(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-212228503L))
            info.cancel();
    }


}
