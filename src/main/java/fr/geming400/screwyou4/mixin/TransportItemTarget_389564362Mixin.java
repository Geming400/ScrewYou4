package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.TransportItemsBetweenContainers.TransportItemTarget.class)
public class TransportItemTarget_389564362Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__519061907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-519061907L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1159987886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1159987886L))
            info.setReturnValue("\u26A30D#x\u5E54gig\u31DD<Qbc? <\u7232W(T\uBA08ES\"\u23A9\uC017-Gc@c*\u8F35.Eb:}x)ph-\u60FB\u9E61{\u6E1D\u67A28(C\u72DB\u99784X_U:.^,Xs$F\uC3F9I\u1B7Bj_sWPnS;$");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_946916452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(946916452L))
            info.setReturnValue(1607486821);
    }

    @Inject(at = @At("HEAD"), method = "container()Lnet/minecraft/world/Container;", cancellable = true)
    private void container__437917892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-437917892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "state()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void state_58054024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(58054024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1891211914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1891211914L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockEntity()Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void blockEntity__851473563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-851473563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryCreatePossibleTarget(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/ai/behavior/TransportItemsBetweenContainers$TransportItemTarget;", cancellable = true)
    private static void tryCreatePossibleTarget__1914655495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1914655495L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryCreatePossibleTarget(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/ai/behavior/TransportItemsBetweenContainers$TransportItemTarget;", cancellable = true)
    private static void tryCreatePossibleTarget__7625262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-7625262L))
            info.setReturnValue(null);
    }


}
