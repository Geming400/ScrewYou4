package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.EndGatewayConfiguration.class)
public class EndGatewayConfiguration803656255Mixin {
        @Inject(at = @At("HEAD"), method = "delayedExitSearch()Lnet/minecraft/world/level/levelgen/feature/configurations/EndGatewayConfiguration;", cancellable = true)
    private static void delayedExitSearch_1855473016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1855473016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "knownExit(Lnet/minecraft/core/BlockPos;Z)Lnet/minecraft/world/level/levelgen/feature/configurations/EndGatewayConfiguration;", cancellable = true)
    private static void knownExit__639535947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-639535947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExit()Ljava/util/Optional;", cancellable = true)
    private void getExit_316729729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(316729729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isExitExact()Z", cancellable = true)
    private void isExitExact_1366324191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1366324191L))
            info.setReturnValue(false);
    }


}
