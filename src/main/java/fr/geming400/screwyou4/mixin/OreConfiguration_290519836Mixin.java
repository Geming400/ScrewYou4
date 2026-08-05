package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration.class)
public class OreConfiguration_290519836Mixin {
        @Inject(at = @At("HEAD"), method = "target(Lnet/minecraft/world/level/levelgen/structure/templatesystem/RuleTest;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/levelgen/feature/configurations/OreConfiguration$TargetBlockState;", cancellable = true)
    private static void target__676533280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-676533280L))
            info.setReturnValue(null);
    }


}
