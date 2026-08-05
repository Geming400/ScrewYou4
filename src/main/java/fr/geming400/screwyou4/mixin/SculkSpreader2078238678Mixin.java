package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SculkSpreader.class)
public class SculkSpreader2078238678Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/world/level/storage/ValueInput;)V", cancellable = true)
    private void load__1985491985(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1985491985L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_2116513417(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2116513417L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void save_859107326(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(859107326L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createLevelSpreader()Lnet/minecraft/world/level/block/SculkSpreader;", cancellable = true)
    private static void createLevelSpreader_1692281932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1692281932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCursors()Ljava/util/List;", cancellable = true)
    private void getCursors__590391802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-590391802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addCursors(Lnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private void addCursors__1252531282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1252531282L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createWorldGenSpreader()Lnet/minecraft/world/level/block/SculkSpreader;", cancellable = true)
    private static void createWorldGenSpreader_1692281932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1692281932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceableBlocks()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void replaceableBlocks__1369394573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1369394573L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateCursors(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;Z)V", cancellable = true)
    private void updateCursors_2130228447(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2130228447L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "additionalDecayRate()I", cancellable = true)
    private void additionalDecayRate_2116500924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116500924L))
            info.setReturnValue(-1792396774);
    }

    @Inject(at = @At("HEAD"), method = "chargeDecayRate()I", cancellable = true)
    private void chargeDecayRate_2116500924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116500924L))
            info.setReturnValue(-1792396774);
    }

    @Inject(at = @At("HEAD"), method = "noGrowthRadius()I", cancellable = true)
    private void noGrowthRadius_2116500924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116500924L))
            info.setReturnValue(-1792396774);
    }

    @Inject(at = @At("HEAD"), method = "growthSpawnCost()I", cancellable = true)
    private void growthSpawnCost_2116500924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116500924L))
            info.setReturnValue(-1792396774);
    }

    @Inject(at = @At("HEAD"), method = "isWorldGeneration()Z", cancellable = true)
    private void isWorldGeneration_2116517261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116517261L))
            info.setReturnValue(true);
    }


}
