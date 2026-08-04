package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.WalkNodeEvaluator.class)
public class WalkNodeEvaluator_1970217418Mixin {
        @Inject(at = @At("HEAD"), method = "done()V", cancellable = true)
    private void done_2008492156(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2008492156L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepare(Lnet/minecraft/world/level/PathNavigationRegion;Lnet/minecraft/world/entity/Mob;)V", cancellable = true)
    private void prepare__1928187060(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1928187060L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTarget(DDD)Lnet/minecraft/world/level/pathfinder/Target;", cancellable = true)
    private void getTarget_1289470120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1289470120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStart()Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void getStart_476999907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476999907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPathTypeWithinMobBB(Lnet/minecraft/world/level/pathfinder/PathfindingContext;III)Ljava/util/Set;", cancellable = true)
    private void getPathTypeWithinMobBB_1342998336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1342998336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkNeighbourBlocks(Lnet/minecraft/world/level/pathfinder/PathfindingContext;IIILnet/minecraft/world/level/pathfinder/PathType;)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private static void checkNeighbourBlocks__1136021799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1136021799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPathTypeOfMob(Lnet/minecraft/world/level/pathfinder/PathfindingContext;IIILnet/minecraft/world/entity/Mob;)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private void getPathTypeOfMob__2071413243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2071413243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPathType(Lnet/minecraft/world/level/pathfinder/PathfindingContext;III)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private void getPathType_1031690907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1031690907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFloorLevel(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)D", cancellable = true)
    private static void getFloorLevel_1392667547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1392667547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPathTypeStatic(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private static void getPathTypeStatic_1307457512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1307457512L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPathTypeStatic(Lnet/minecraft/world/level/pathfinder/PathfindingContext;Lnet/minecraft/core/BlockPos$MutableBlockPos;)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private static void getPathTypeStatic__478487003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-478487003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNeighbors([Lnet/minecraft/world/level/pathfinder/Node;Lnet/minecraft/world/level/pathfinder/Node;)I", cancellable = true)
    private void getNeighbors_1321622234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1321622234L))
            info.setReturnValue(null);
    }


}
