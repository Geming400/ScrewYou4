package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.WalkNodeEvaluator.class)
public class WalkNodeEvaluator_1970217418Mixin {
        @Inject(at = @At("HEAD"), method = "done()V", cancellable = true)
    private void done__732174790(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-732174790L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepare(Lnet/minecraft/world/level/PathNavigationRegion;Lnet/minecraft/world/entity/Mob;)V", cancellable = true)
    private void prepare_1737955493(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1737955493L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTarget(DDD)Lnet/minecraft/world/level/pathfinder/Target;", cancellable = true)
    private void getTarget_897773487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(897773487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNeighbors([Lnet/minecraft/world/level/pathfinder/Node;Lnet/minecraft/world/level/pathfinder/Node;)I", cancellable = true)
    private void getNeighbors__2097223323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2097223323L))
            info.setReturnValue(-760219687);
    }

    @Inject(at = @At("HEAD"), method = "getPathTypeStatic(Lnet/minecraft/world/level/pathfinder/PathfindingContext;Lnet/minecraft/core/BlockPos$MutableBlockPos;)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private static void getPathTypeStatic__1577544126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1577544126L))
            info.setReturnValue(net.minecraft.world.level.pathfinder.PathType.DOOR_WOOD_CLOSED);
    }

    @Inject(at = @At("HEAD"), method = "getPathTypeStatic(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private static void getPathTypeStatic__1937094869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1937094869L))
            info.setReturnValue(net.minecraft.world.level.pathfinder.PathType.BLOCKED);
    }

    @Inject(at = @At("HEAD"), method = "getFloorLevel(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)D", cancellable = true)
    private static void getFloorLevel__2032288627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2032288627L))
            info.setReturnValue(2.9410900078713864E8D);
    }

    @Inject(at = @At("HEAD"), method = "getPathType(Lnet/minecraft/world/level/pathfinder/PathfindingContext;III)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private void getPathType__1149095034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1149095034L))
            info.setReturnValue(net.minecraft.world.level.pathfinder.PathType.BLOCKED);
    }

    @Inject(at = @At("HEAD"), method = "getStart()Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void getStart_225544375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(225544375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPathTypeWithinMobBB(Lnet/minecraft/world/level/pathfinder/PathfindingContext;III)Ljava/util/Set;", cancellable = true)
    private void getPathTypeWithinMobBB__1222413472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1222413472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPathTypeOfMob(Lnet/minecraft/world/level/pathfinder/PathfindingContext;IIILnet/minecraft/world/entity/Mob;)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private void getPathTypeOfMob__1450669231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450669231L))
            info.setReturnValue(net.minecraft.world.level.pathfinder.PathType.TRAPDOOR);
    }

    @Inject(at = @At("HEAD"), method = "checkNeighbourBlocks(Lnet/minecraft/world/level/pathfinder/PathfindingContext;IIILnet/minecraft/world/level/pathfinder/PathType;)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private static void checkNeighbourBlocks_809223028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809223028L))
            info.setReturnValue(net.minecraft.world.level.pathfinder.PathType.RAIL);
    }


}
