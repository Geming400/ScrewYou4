package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.PlacedFeature.class)
public class PlacedFeature_1825025669Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1084429369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1084429369L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_689565197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(689565197L))
            info.setReturnValue("/YBzdUw/)P!Mybᦥ8塀89.EH@oy⼵3g躄r&rvN祌?濫պuA@GBF้x!|@'JPhJ?#pZzkw1)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1863288410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1863288410L))
            info.setReturnValue(1427390869);
    }

    @Inject(at = @At("HEAD"), method = "feature()Lnet/minecraft/core/Holder;", cancellable = true)
    private void feature__921065856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-921065856L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void place_307143623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(307143623L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "placeWithBiomeCheck(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void placeWithBiomeCheck_307143623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(307143623L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getFeatures()Ljava/util/stream/Stream;", cancellable = true)
    private void getFeatures_1614319353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1614319353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placement()Ljava/util/List;", cancellable = true)
    private void placement__843604812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-843604812L))
            info.setReturnValue(null);
    }


}
