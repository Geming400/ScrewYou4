package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.features.MiscOverworldFeatures.class)
public class MiscOverworldFeatures_1427821311Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap_235302807(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(235302807L))
            info.cancel();
    }


}
