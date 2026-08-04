package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.redstone.DefaultRedstoneWireEvaluator.class)
public class DefaultRedstoneWireEvaluator_413448405Mixin {
        @Inject(at = @At("HEAD"), method = "updatePowerStrength(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/redstone/Orientation;Z)V", cancellable = true)
    private void updatePowerStrength_957585087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(957585087L))
            info.cancel();
    }


}
