package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.PotentialCalculator.class)
public class PotentialCalculator_2030474030Mixin {
        @Inject(at = @At("HEAD"), method = "addCharge(Lnet/minecraft/core/BlockPos;D)V", cancellable = true)
    private void addCharge_1989700267(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1989700267L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPotentialEnergyChange(Lnet/minecraft/core/BlockPos;D)D", cancellable = true)
    private void getPotentialEnergyChange_1594274830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1594274830L))
            info.setReturnValue(2.8336190053304505E8D);
    }


}
