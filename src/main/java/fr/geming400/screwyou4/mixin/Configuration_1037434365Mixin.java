package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.LakeFeature.Configuration.class)
public class Configuration_1037434365Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_128808096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(128808096L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1807857889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1807857889L))
            info.setReturnValue(" LY\u6F4AO?tOq\u6175S\"'ze\u66ADVZ)*f\uA0B5gPknSAJb\u391AI\u5FE8Ls\u8B48.");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1594786455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1594786455L))
            info.setReturnValue(214634281);
    }

    @Inject(at = @At("HEAD"), method = "fluid()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void fluid_933824129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(933824129L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "barrier()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void barrier__352991442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-352991442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canReplaceWithAirOrFluid()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void canReplaceWithAirOrFluid_378662434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(378662434L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canReplaceWithBarrier()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void canReplaceWithBarrier__674720004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-674720004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceFeature()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void canPlaceFeature_1261354890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1261354890L))
            info.setReturnValue(null);
    }


}
