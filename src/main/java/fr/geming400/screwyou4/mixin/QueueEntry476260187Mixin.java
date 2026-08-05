package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.lighting.LightEngine.QueueEntry.class)
public class QueueEntry476260187Mixin {
        @Inject(at = @At("HEAD"), method = "isIncreaseFromEmission(J)Z", cancellable = true)
    private static void isIncreaseFromEmission_1691104772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1691104772L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "increaseSkipOneDirection(IZLnet/minecraft/core/Direction;)J", cancellable = true)
    private static void increaseSkipOneDirection_674748151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(674748151L))
            info.setReturnValue(-609284513393149114L);
    }

    @Inject(at = @At("HEAD"), method = "increaseLightFromEmission(IZ)J", cancellable = true)
    private static void increaseLightFromEmission__503930709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503930709L))
            info.setReturnValue(3005427410596353156L);
    }

    @Inject(at = @At("HEAD"), method = "decreaseAllDirections(I)J", cancellable = true)
    private static void decreaseAllDirections_1690165875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1690165875L))
            info.setReturnValue(4660361233151550045L);
    }

    @Inject(at = @At("HEAD"), method = "getFromLevel(J)I", cancellable = true)
    private static void getFromLevel_1691088435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1691088435L))
            info.setReturnValue(164760458);
    }

    @Inject(at = @At("HEAD"), method = "increaseOnlyOneDirection(IZLnet/minecraft/core/Direction;)J", cancellable = true)
    private static void increaseOnlyOneDirection_674748151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(674748151L))
            info.setReturnValue(-609284513393149114L);
    }

    @Inject(at = @At("HEAD"), method = "decreaseSkipOneDirection(ILnet/minecraft/core/Direction;)J", cancellable = true)
    private static void decreaseSkipOneDirection_1165216447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1165216447L))
            info.setReturnValue(7775942638710959235L);
    }

    @Inject(at = @At("HEAD"), method = "isFromEmptyShape(J)Z", cancellable = true)
    private static void isFromEmptyShape_1691104772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1691104772L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldPropagateInDirection(JLnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void shouldPropagateInDirection__1404254576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1404254576L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "increaseSkySourceInDirections(ZZZZZ)J", cancellable = true)
    private static void increaseSkySourceInDirections_614666116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(614666116L))
            info.setReturnValue(108105051903557379L);
    }


}
