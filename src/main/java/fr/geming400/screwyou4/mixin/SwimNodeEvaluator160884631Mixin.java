package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.SwimNodeEvaluator.class)
public class SwimNodeEvaluator160884631Mixin {
        @Inject(at = @At("HEAD"), method = "done()V", cancellable = true)
    private void done_1753459720(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1753459720L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepare(Lnet/minecraft/world/level/PathNavigationRegion;Lnet/minecraft/world/entity/Mob;)V", cancellable = true)
    private void prepare__71377293(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-71377293L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTarget(DDD)Lnet/minecraft/world/level/pathfinder/Target;", cancellable = true)
    private void getTarget__911559299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-911559299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNeighbors([Lnet/minecraft/world/level/pathfinder/Node;Lnet/minecraft/world/level/pathfinder/Node;)I", cancellable = true)
    private void getNeighbors_388411187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(388411187L))
            info.setReturnValue(525286767);
    }

    @Inject(at = @At("HEAD"), method = "getPathType(Lnet/minecraft/world/level/pathfinder/PathfindingContext;III)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private void getPathType_1336539476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1336539476L))
            info.setReturnValue(net.minecraft.world.level.pathfinder.PathType.POWDER_SNOW);
    }

    @Inject(at = @At("HEAD"), method = "getStart()Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void getStart__1583788411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1583788411L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPathTypeOfMob(Lnet/minecraft/world/level/pathfinder/PathfindingContext;IIILnet/minecraft/world/entity/Mob;)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private void getPathTypeOfMob_1034965279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1034965279L))
            info.setReturnValue(net.minecraft.world.level.pathfinder.PathType.FIRE);
    }


}
