package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.cubemob.Slime.class)
public class Slime_1343996326Mixin {
        @Inject(at = @At("HEAD"), method = "setSize(IZ)V", cancellable = true)
    private void setSize_363816713(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(363816713L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1102239033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1102239033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkSlimeSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkSlimeSpawnRules_501732631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(501732631L))
            info.setReturnValue(null);
    }


}
