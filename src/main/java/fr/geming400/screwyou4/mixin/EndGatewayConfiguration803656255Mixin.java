package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.EndGatewayConfiguration.class)
public class EndGatewayConfiguration803656255Mixin {
        @Inject(at = @At("HEAD"), method = "isExitExact()Z", cancellable = true)
    private void isExitExact_841934838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(841934838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExit()Ljava/util/Optional;", cancellable = true)
    private void getExit_1049117677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1049117677L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "delayedExitSearch()Lnet/minecraft/world/level/levelgen/feature/configurations/EndGatewayConfiguration;", cancellable = true)
    private static void delayedExitSearch_1225101792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1225101792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "knownExit(Lnet/minecraft/core/BlockPos;Z)Lnet/minecraft/world/level/levelgen/feature/configurations/EndGatewayConfiguration;", cancellable = true)
    private static void knownExit__1164352234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1164352234L))
            info.setReturnValue(null);
    }


}
