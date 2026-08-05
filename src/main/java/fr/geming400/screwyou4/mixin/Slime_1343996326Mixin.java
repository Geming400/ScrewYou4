package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.cubemob.Slime.class)
public class Slime_1343996326Mixin {
        @Inject(at = @At("HEAD"), method = "setSize(IZ)V", cancellable = true)
    private void setSize_1060793894(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1060793894L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkSlimeSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkSlimeSpawnRules__1098819685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1098819685L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_2094094634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2094094634L))
            info.setReturnValue(null);
    }


}
