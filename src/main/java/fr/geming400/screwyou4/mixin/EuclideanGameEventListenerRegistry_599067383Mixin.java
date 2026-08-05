package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.EuclideanGameEventListenerRegistry.class)
public class EuclideanGameEventListenerRegistry_599067383Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1658183754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1658183754L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/world/level/gameevent/GameEventListener;)V", cancellable = true)
    private void register__1130032214(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1130032214L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unregister(Lnet/minecraft/world/level/gameevent/GameEventListener;)V", cancellable = true)
    private void unregister_1815930307(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1815930307L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitInRangeListeners(Lnet/minecraft/core/Holder;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/gameevent/GameEvent$Context;Lnet/minecraft/world/level/gameevent/GameEventListenerRegistry$ListenerVisitor;)Z", cancellable = true)
    private void visitInRangeListeners__582552548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-582552548L))
            info.setReturnValue(true);
    }


}
