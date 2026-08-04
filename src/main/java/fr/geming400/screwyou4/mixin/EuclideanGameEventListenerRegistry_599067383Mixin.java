package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.EuclideanGameEventListenerRegistry.class)
public class EuclideanGameEventListenerRegistry_599067383Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_637345965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(637345965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/world/level/gameevent/GameEventListener;)V", cancellable = true)
    private void register_470594439(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(470594439L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unregister(Lnet/minecraft/world/level/gameevent/GameEventListener;)V", cancellable = true)
    private void unregister_470594439(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(470594439L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitInRangeListeners(Lnet/minecraft/core/Holder;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/gameevent/GameEvent$Context;Lnet/minecraft/world/level/gameevent/GameEventListenerRegistry$ListenerVisitor;)Z", cancellable = true)
    private void visitInRangeListeners_461867598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(461867598L))
            info.setReturnValue(null);
    }


}
