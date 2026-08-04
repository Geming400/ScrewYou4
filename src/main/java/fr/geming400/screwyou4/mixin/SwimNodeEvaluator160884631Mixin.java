package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.SwimNodeEvaluator.class)
public class SwimNodeEvaluator160884631Mixin {
        @Inject(at = @At("HEAD"), method = "done()V", cancellable = true)
    private void done_199159370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(199159370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepare(Lnet/minecraft/world/level/PathNavigationRegion;Lnet/minecraft/world/entity/Mob;)V", cancellable = true)
    private void prepare_557447450(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(557447450L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTarget(DDD)Lnet/minecraft/world/level/pathfinder/Target;", cancellable = true)
    private void getTarget__519862666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-519862666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStart()Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void getStart__1332332879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1332332879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPathTypeOfMob(Lnet/minecraft/world/level/pathfinder/PathfindingContext;IIILnet/minecraft/world/entity/Mob;)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private void getPathTypeOfMob_414221267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(414221267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPathType(Lnet/minecraft/world/level/pathfinder/PathfindingContext;III)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private void getPathType__777641879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-777641879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNeighbors([Lnet/minecraft/world/level/pathfinder/Node;Lnet/minecraft/world/level/pathfinder/Node;)I", cancellable = true)
    private void getNeighbors__487710552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-487710552L))
            info.setReturnValue(null);
    }


}
