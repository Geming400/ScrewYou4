package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.GameEvent.Context.class)
public class Context132875613Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1518387872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1518387872L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1002584362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1002584362L))
            info.setReturnValue("[Hh");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_171138355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(171138355L))
            info.setReturnValue(1369727229);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/level/gameevent/GameEvent$Context;", cancellable = true)
    private static void of__1105043646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1105043646L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/gameevent/GameEvent$Context;", cancellable = true)
    private static void of_280988184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(280988184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/gameevent/GameEvent$Context;", cancellable = true)
    private static void of_939321585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(939321585L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sourceEntity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void sourceEntity_1961764067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1961764067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "affectedState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void affectedState_2132084043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2132084043L))
            info.setReturnValue(null);
    }


}
