package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.SpawnPlacements.class)
public class SpawnPlacements_540099717Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/entity/SpawnPlacementType;Lnet/minecraft/world/level/levelgen/Heightmap$Types;Lnet/minecraft/world/entity/SpawnPlacements$SpawnPredicate;)V", cancellable = true)
    private static void register_454448943(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(454448943L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkSpawnRules__1245277351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1245277351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSpawnPositionOk(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isSpawnPositionOk_1214606554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1214606554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeightmapType(Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/world/level/levelgen/Heightmap$Types;", cancellable = true)
    private static void getHeightmapType_744198888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(744198888L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlacementType(Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/world/entity/SpawnPlacementType;", cancellable = true)
    private static void getPlacementType__21485376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-21485376L))
            info.setReturnValue(null);
    }


}
