package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.BinaryHeap.class)
public class BinaryHeap586018805Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/world/level/pathfinder/Node;)V", cancellable = true)
    private void remove_987274393(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(987274393L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1029750394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1029750394L))
            info.setReturnValue(-1624766878);
    }

    @Inject(at = @At("HEAD"), method = "insert(Lnet/minecraft/world/level/pathfinder/Node;)Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void insert__1079606859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1079606859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear__199808901(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-199808901L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1645135177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1645135177L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "peek()Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void peek__1481361324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1481361324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pop()Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void pop__1720286050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1720286050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "changeCost(Lnet/minecraft/world/level/pathfinder/Node;F)V", cancellable = true)
    private void changeCost__286401836(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-286401836L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeap()[Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void getHeap_1427342232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1427342232L))
            info.setReturnValue(null);
    }


}
