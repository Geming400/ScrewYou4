package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.GameEvent.ListenerInfo.class)
public class ListenerInfo638432420Mixin {
        @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo__1253671514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1253671514L))
            info.setReturnValue(1742805948);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lnet/minecraft/world/level/gameevent/GameEvent$ListenerInfo;)I", cancellable = true)
    private void compareTo_259390616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(259390616L))
            info.setReturnValue(-263884992);
    }

    @Inject(at = @At("HEAD"), method = "source()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void source_75318434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(75318434L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "context()Lnet/minecraft/world/level/gameevent/GameEvent$Context;", cancellable = true)
    private void context_417138537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(417138537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameEvent()Lnet/minecraft/core/Holder;", cancellable = true)
    private void gameEvent__1925769768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1925769768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipient()Lnet/minecraft/world/level/gameevent/GameEventListener;", cancellable = true)
    private void recipient_461144118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(461144118L))
            info.setReturnValue(null);
    }


}
