package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.LakeFeature.class)
public class LakeFeature2067665913Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__1512043647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1512043647L))
            info.setReturnValue(false);
    }


}
