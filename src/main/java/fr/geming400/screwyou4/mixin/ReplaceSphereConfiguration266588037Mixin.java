package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.ReplaceSphereConfiguration.class)
public class ReplaceSphereConfiguration266588037Mixin {
        @Inject(at = @At("HEAD"), method = "radius()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void radius_2091868430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2091868430L))
            info.setReturnValue(null);
    }


}
