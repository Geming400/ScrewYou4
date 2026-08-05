package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration.TreeConfigurationBuilder.class)
public class TreeConfigurationBuilder272241671Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/levelgen/feature/configurations/TreeConfiguration;", cancellable = true)
    private void build__1386230491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1386230491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decorators(Ljava/util/List;)Lnet/minecraft/world/level/levelgen/feature/configurations/TreeConfiguration$TreeConfigurationBuilder;", cancellable = true)
    private void decorators_1862257219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1862257219L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ignoreVines()Lnet/minecraft/world/level/levelgen/feature/configurations/TreeConfiguration$TreeConfigurationBuilder;", cancellable = true)
    private void ignoreVines__1543486892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1543486892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "belowTrunkProvider(Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;)Lnet/minecraft/world/level/levelgen/feature/configurations/TreeConfiguration$TreeConfigurationBuilder;", cancellable = true)
    private void belowTrunkProvider_346611480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(346611480L))
            info.setReturnValue(null);
    }


}
