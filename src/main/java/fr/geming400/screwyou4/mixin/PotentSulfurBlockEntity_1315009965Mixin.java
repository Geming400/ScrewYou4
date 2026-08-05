package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.PotentSulfurBlockEntity.class)
public class PotentSulfurBlockEntity_1315009965Mixin {
        @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/world/level/Level;)V", cancellable = true)
    private void setLevel_310035022(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(310035022L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "geyserPositional(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private static void geyserPositional_1180147988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1180147988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeReachedByNoxiousGas(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private static void canBeReachedByNoxiousGas__147163262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-147163262L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "resetCountdown()V", cancellable = true)
    private void resetCountdown_1353284703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1353284703L))
            info.cancel();
    }


}
