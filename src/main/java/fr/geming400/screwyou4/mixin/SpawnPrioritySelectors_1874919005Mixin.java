package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.variant.SpawnPrioritySelectors.class)
public class SpawnPrioritySelectors_1874919005Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_966292736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(966292736L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1649624767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1649624767L))
            info.setReturnValue("M0-fV+rq@[\u96D4z2(o$GC8M\u24671a]=P\uD5AFoEL1\u25B7d/q\uF93CJRgl.9/L>@xvc%gsb5jgC3");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1862696201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1862696201L))
            info.setReturnValue(1883550154);
    }

    @Inject(at = @At("HEAD"), method = "single(Lnet/minecraft/world/entity/variant/SpawnCondition;I)Lnet/minecraft/world/entity/variant/SpawnPrioritySelectors;", cancellable = true)
    private static void single__804483395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-804483395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallback(I)Lnet/minecraft/world/entity/variant/SpawnPrioritySelectors;", cancellable = true)
    private static void fallback__560550503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-560550503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectors()Ljava/util/List;", cancellable = true)
    private void selectors_1445245696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1445245696L))
            info.setReturnValue(null);
    }


}
