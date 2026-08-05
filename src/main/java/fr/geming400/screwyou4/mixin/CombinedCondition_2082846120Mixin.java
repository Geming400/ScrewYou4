package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.multipart.CombinedCondition.class)
public class CombinedCondition_2082846120Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__826608918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-826608918L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_947386144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(947386144L))
            info.setReturnValue("I7ZHGHrs0uNUajmM$xX:'H@:蘄)>vOE쐧?I|8H釧禰E/亊UWLlQ=a;R濫U'`s{pꪐD}切}昦7`h");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2121108861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2121108861L))
            info.setReturnValue(1626839514);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/world/level/block/state/StateDefinition;)Ljava/util/function/Predicate;", cancellable = true)
    private void instantiate_414180518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(414180518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "operation()Lnet/minecraft/client/renderer/block/dispatch/multipart/CombinedCondition$Operation;", cancellable = true)
    private void operation_645373366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(645373366L))
            info.setReturnValue(net.minecraft.client.renderer.block.dispatch.multipart.CombinedCondition.Operation.OR);
    }

    @Inject(at = @At("HEAD"), method = "terms()Ljava/util/List;", cancellable = true)
    private void terms__585784361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-585784361L))
            info.setReturnValue(null);
    }


}
