package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration.class)
public class TreeConfiguration1598361514Mixin {
        @Inject(at = @At("HEAD"), method = "defaultPlaceBelowTreeTrunkProvider(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private static void defaultPlaceBelowTreeTrunkProvider_1371161561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1371161561L))
            info.setReturnValue(null);
    }


}
