package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.RailState.class)
public class RailState_1407286575Mixin {
        @Inject(at = @At("HEAD"), method = "getState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getState_413455799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(413455799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getConnections()Ljava/util/List;", cancellable = true)
    private void getConnections__557921795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-557921795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "place(ZZLnet/minecraft/world/level/block/state/properties/RailShape;)Lnet/minecraft/world/level/block/RailState;", cancellable = true)
    private void place_2059909162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2059909162L))
            info.setReturnValue(null);
    }


}
