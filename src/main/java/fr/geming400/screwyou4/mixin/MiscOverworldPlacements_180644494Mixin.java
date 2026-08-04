package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.placement.MiscOverworldPlacements.class)
public class MiscOverworldPlacements_180644494Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap__1011874010(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1011874010L))
            info.cancel();
    }


}
