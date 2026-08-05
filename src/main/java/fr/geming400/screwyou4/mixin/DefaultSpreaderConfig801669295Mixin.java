package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.MultifaceSpreader.DefaultSpreaderConfig.class)
public class DefaultSpreaderConfig801669295Mixin {
        @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_1663611305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1663611305L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSpreadInto(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/MultifaceSpreader$SpreadPos;)Z", cancellable = true)
    private void canSpreadInto_589580335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(589580335L))
            info.setReturnValue(true);
    }


}
