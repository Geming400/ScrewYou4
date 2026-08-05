package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.lighting.LeveledPriorityQueue.class)
public class LeveledPriorityQueue670665424Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_708944007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(708944007L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "enqueue(JI)V", cancellable = true)
    private void enqueue__296584894(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-296584894L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dequeue(JII)V", cancellable = true)
    private void dequeue_778076701(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(778076701L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeFirstLong()J", cancellable = true)
    private void removeFirstLong_708928631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(708928631L))
            info.setReturnValue(-1322496178808118187L);
    }


}
