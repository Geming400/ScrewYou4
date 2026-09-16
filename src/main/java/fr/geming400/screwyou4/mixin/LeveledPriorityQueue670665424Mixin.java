package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.lighting.LeveledPriorityQueue.class)
public class LeveledPriorityQueue670665424Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1729781796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1729781796L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "enqueue(JI)V", cancellable = true)
    private void enqueue_421958202(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(421958202L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dequeue(JII)V", cancellable = true)
    private void dequeue_325584717(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(325584717L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeFirstLong()J", cancellable = true)
    private void removeFirstLong__1639764913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1639764913L))
            info.setReturnValue(-2761465463291137527L);
    }


}
