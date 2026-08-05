package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntitySelector.class)
public class EntitySelector_1770857538Mixin {
        @Inject(at = @At("HEAD"), method = "withinDistance(DDDD)Ljava/util/function/Predicate;", cancellable = true)
    private static void withinDistance__1843088633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1843088633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "notRiding(Lnet/minecraft/world/entity/Entity;)Ljava/util/function/Predicate;", cancellable = true)
    private static void notRiding__1334585650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1334585650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pushableBy(Lnet/minecraft/world/entity/Entity;)Ljava/util/function/Predicate;", cancellable = true)
    private static void pushableBy__1334585650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1334585650L))
            info.setReturnValue(null);
    }


}
