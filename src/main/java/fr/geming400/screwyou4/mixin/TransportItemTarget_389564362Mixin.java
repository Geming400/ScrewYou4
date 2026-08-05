package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.TransportItemsBetweenContainers.TransportItemTarget.class)
public class TransportItemTarget_389564362Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1775076620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1775076620L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__745895614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-745895614L))
            info.setReturnValue("n8}wWtdM`u=N\u44CB]>=hm{`kJ,PYF\uA425e\uB784|OeF\u11BBl,S]W7^6CW#6{7MO@\u6D18p\uBFAC3y<Q,J1T\u14214Z74KM>YD(V^S38`@");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_427827103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(427827103L))
            info.setReturnValue(-1602030767);
    }

    @Inject(at = @At("HEAD"), method = "container()Lnet/minecraft/world/Container;", cancellable = true)
    private void container_1819233117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1819233117L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "state()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void state__1906194505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1906194505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1503822518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1503822518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryCreatePossibleTarget(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/ai/behavior/TransportItemsBetweenContainers$TransportItemTarget;", cancellable = true)
    private static void tryCreatePossibleTarget_871646258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871646258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryCreatePossibleTarget(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/ai/behavior/TransportItemsBetweenContainers$TransportItemTarget;", cancellable = true)
    private static void tryCreatePossibleTarget_1402043065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1402043065L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockEntity()Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void blockEntity_948700309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948700309L))
            info.setReturnValue(null);
    }


}
