package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.Aquifer.NoiseBasedAquifer.class)
public class NoiseBasedAquifer_1436449349Mixin {
        @Inject(at = @At("HEAD"), method = "shouldScheduleFluidUpdate()Z", cancellable = true)
    private void shouldScheduleFluidUpdate__1779920334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1779920334L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "computeSubstance(Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;D)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void computeSubstance_1424592584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1424592584L))
            info.setReturnValue(null);
    }


}
