package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.GameEvent.ListenerInfo.class)
public class ListenerInfo638432420Mixin {
        @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo_2024056806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2024056806L))
            info.setReturnValue(1518239726);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lnet/minecraft/world/level/gameevent/GameEvent$ListenerInfo;)I", cancellable = true)
    private void compareTo__908372264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-908372264L))
            info.setReturnValue(-570647944);
    }

    @Inject(at = @At("HEAD"), method = "source()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void source_1736161949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1736161949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "context()Lnet/minecraft/world/level/gameevent/GameEvent$Context;", cancellable = true)
    private void context_172054136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(172054136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameEvent()Lnet/minecraft/core/Holder;", cancellable = true)
    private void gameEvent__2107659104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2107659104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipient()Lnet/minecraft/world/level/gameevent/GameEventListener;", cancellable = true)
    private void recipient_1175344623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1175344623L))
            info.setReturnValue(null);
    }


}
