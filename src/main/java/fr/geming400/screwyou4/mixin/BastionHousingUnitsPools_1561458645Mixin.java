package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.BastionHousingUnitsPools.class)
public class BastionHousingUnitsPools_1561458645Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap_368940141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(368940141L))
            info.cancel();
    }


}
