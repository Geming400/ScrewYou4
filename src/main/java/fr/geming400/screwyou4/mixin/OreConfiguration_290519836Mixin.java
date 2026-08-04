package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration.class)
public class OreConfiguration_290519836Mixin {
        @Inject(at = @At("HEAD"), method = "target(Lnet/minecraft/world/level/levelgen/structure/templatesystem/RuleTest;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/levelgen/feature/configurations/OreConfiguration$TargetBlockState;", cancellable = true)
    private static void target_692981841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(692981841L))
            info.setReturnValue(null);
    }


}
