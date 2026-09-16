package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SculkSpreader.class)
public class SculkSpreader2078238678Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/world/level/storage/ValueInput;)V", cancellable = true)
    private void load__1224656567(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1224656567L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1292410972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1292410972L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void save_677698811(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(677698811L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "additionalDecayRate()I", cancellable = true)
    private void additionalDecayRate__1258714551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1258714551L))
            info.setReturnValue(2091643715);
    }

    @Inject(at = @At("HEAD"), method = "noGrowthRadius()I", cancellable = true)
    private void noGrowthRadius__887628702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-887628702L))
            info.setReturnValue(-151307839);
    }

    @Inject(at = @At("HEAD"), method = "chargeDecayRate()I", cancellable = true)
    private void chargeDecayRate__1380468202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1380468202L))
            info.setReturnValue(1771879980);
    }

    @Inject(at = @At("HEAD"), method = "replaceableBlocks()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void replaceableBlocks__2064595265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2064595265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateCursors(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;Z)V", cancellable = true)
    private void updateCursors__1426724213(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1426724213L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "growthSpawnCost()I", cancellable = true)
    private void growthSpawnCost__974531973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-974531973L))
            info.setReturnValue(699131414);
    }

    @Inject(at = @At("HEAD"), method = "isWorldGeneration()Z", cancellable = true)
    private void isWorldGeneration__947744307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-947744307L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createLevelSpreader()Lnet/minecraft/world/level/block/SculkSpreader;", cancellable = true)
    private static void createLevelSpreader__230125084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-230125084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCursors()Ljava/util/List;", cancellable = true)
    private void getCursors_873041965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(873041965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWorldGenSpreader()Lnet/minecraft/world/level/block/SculkSpreader;", cancellable = true)
    private static void createWorldGenSpreader__106548462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-106548462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addCursors(Lnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private void addCursors_1972589106(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1972589106L))
            info.cancel();
    }


}
