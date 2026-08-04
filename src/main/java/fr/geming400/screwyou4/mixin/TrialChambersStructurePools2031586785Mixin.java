package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.TrialChambersStructurePools.class)
public class TrialChambersStructurePools2031586785Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap_839068282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(839068282L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawner(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void spawner__1050638440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1050638440L))
            info.setReturnValue(null);
    }


}
