package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.BinaryHeap.class)
public class BinaryHeap586018805Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/world/level/pathfinder/Node;)V", cancellable = true)
    private void remove__563463147(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-563463147L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_624281051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(624281051L))
            info.setReturnValue(-1382145539);
    }

    @Inject(at = @At("HEAD"), method = "insert(Lnet/minecraft/world/level/pathfinder/Node;)Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void insert_30895164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(30895164L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_624293544(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(624293544L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_624297388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(624297388L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "peek()Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void peek__907198705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-907198705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pop()Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void pop__907198705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-907198705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "changeCost(Lnet/minecraft/world/level/pathfinder/Node;F)V", cancellable = true)
    private void changeCost__663553839(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-663553839L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeap()[Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void getHeap__2140513994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2140513994L))
            info.setReturnValue(null);
    }


}
