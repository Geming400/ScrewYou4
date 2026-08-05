package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.variant.PriorityProvider.UnpackedEntry.class)
public class UnpackedEntry_1126586552Mixin {
        @Inject(at = @At("HEAD"), method = "priority()I", cancellable = true)
    private void priority_1164848797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1164848797L))
            info.setReturnValue(-416726585);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1782868486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1782868486L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__8873424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-8873424L))
            info.setReturnValue("[&T&ETob:dIda3(\u411E3;\u17D5h>&sE}sW[?$T\uB219P\u5839P\uABB7\u3E7A }=%-j");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1164849293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1164849293L))
            info.setReturnValue(956057490);
    }

    @Inject(at = @At("HEAD"), method = "entry()Ljava/lang/Object;", cancellable = true)
    private void entry__1309188526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1309188526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "condition()Lnet/minecraft/world/entity/variant/PriorityProvider$SelectorCondition;", cancellable = true)
    private void condition__1782644439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1782644439L))
            info.setReturnValue(null);
    }


}
