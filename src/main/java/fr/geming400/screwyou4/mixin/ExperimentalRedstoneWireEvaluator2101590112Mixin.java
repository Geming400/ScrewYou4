package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.redstone.ExperimentalRedstoneWireEvaluator.class)
public class ExperimentalRedstoneWireEvaluator2101590112Mixin {
        @Inject(at = @At("HEAD"), method = "updatePowerStrength(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/redstone/Orientation;Z)V", cancellable = true)
    private void updatePowerStrength__86903128(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-86903128L))
            info.cancel();
    }


}
