package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.ReplaceSphereConfiguration.class)
public class ReplaceSphereConfiguration266588037Mixin {
        @Inject(at = @At("HEAD"), method = "radius()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void radius__1400275140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1400275140L))
            info.setReturnValue(null);
    }


}
