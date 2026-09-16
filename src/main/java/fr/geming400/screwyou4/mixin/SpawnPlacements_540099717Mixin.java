package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.SpawnPlacements.class)
public class SpawnPlacements_540099717Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/entity/SpawnPlacementType;Lnet/minecraft/world/level/levelgen/Heightmap$Types;Lnet/minecraft/world/entity/SpawnPlacements$SpawnPredicate;)V", cancellable = true)
    private static void register__260764142(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-260764142L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkSpawnRules__15210123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-15210123L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isSpawnPositionOk(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isSpawnPositionOk__1934714608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1934714608L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPlacementType(Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/world/entity/SpawnPlacementType;", cancellable = true)
    private static void getPlacementType__494874743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-494874743L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeightmapType(Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/world/level/levelgen/Heightmap$Types;", cancellable = true)
    private static void getHeightmapType__1090510897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090510897L))
            info.setReturnValue(net.minecraft.world.level.levelgen.Heightmap.Types.WORLD_SURFACE_WG);
    }


}
