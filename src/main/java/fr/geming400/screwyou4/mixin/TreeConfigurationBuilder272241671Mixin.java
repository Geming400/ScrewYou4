package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration.TreeConfigurationBuilder.class)
public class TreeConfigurationBuilder272241671Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/levelgen/feature/configurations/TreeConfiguration;", cancellable = true)
    private void build__780902281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-780902281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decorators(Ljava/util/List;)Lnet/minecraft/world/level/levelgen/feature/configurations/TreeConfiguration$TreeConfigurationBuilder;", cancellable = true)
    private void decorators__317346853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-317346853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ignoreVines()Lnet/minecraft/world/level/levelgen/feature/configurations/TreeConfiguration$TreeConfigurationBuilder;", cancellable = true)
    private void ignoreVines_1786186987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1786186987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "belowTrunkProvider(Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;)Lnet/minecraft/world/level/levelgen/feature/configurations/TreeConfiguration$TreeConfigurationBuilder;", cancellable = true)
    private void belowTrunkProvider_1631896108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1631896108L))
            info.setReturnValue(null);
    }


}
