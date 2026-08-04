package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.TrailRuinsStructurePools.class)
public class TrailRuinsStructurePools_26795529Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap__1165722975(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1165722975L))
            info.cancel();
    }


}
