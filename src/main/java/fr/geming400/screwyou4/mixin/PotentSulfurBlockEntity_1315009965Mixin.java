package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.PotentSulfurBlockEntity.class)
public class PotentSulfurBlockEntity_1315009965Mixin {
        @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/world/level/Level;)V", cancellable = true)
    private void setLevel__1356669680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1356669680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetCountdown()V", cancellable = true)
    private void resetCountdown_1712279549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1712279549L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canBeReachedByNoxiousGas(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private static void canBeReachedByNoxiousGas__212962122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-212962122L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "geyserPositional(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private static void geyserPositional_1162298861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1162298861L))
            info.setReturnValue(null);
    }


}
