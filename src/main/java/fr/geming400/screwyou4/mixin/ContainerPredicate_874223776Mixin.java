package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.ContainerPredicate.class)
public class ContainerPredicate_874223776Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2035231262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035231262L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__261236200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-261236200L))
            info.setReturnValue("Hbdm鼧k'0U|tg=Pj:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_912486517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(912486517L))
            info.setReturnValue(752215556);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType_2142542638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2142542638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches__2035102798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035102798L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/component/ItemContainerContents;)Z", cancellable = true)
    private void matches__1734902598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1734902598L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "items()Ljava/util/Optional;", cancellable = true)
    private void items_1119685197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1119685197L))
            info.setReturnValue(null);
    }


}
