package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.grower.TreeGrower.class)
public class TreeGrower_1830992374Mixin {
        @Inject(at = @At("HEAD"), method = "growTree(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void growTree_1009207092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1009207092L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getMinimumHeight(Lnet/minecraft/server/level/ServerLevel;)Ljava/util/OptionalInt;", cancellable = true)
    private void getMinimumHeight__282815108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-282815108L))
            info.setReturnValue(null);
    }


}
