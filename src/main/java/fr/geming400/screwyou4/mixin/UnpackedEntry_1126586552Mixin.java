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
            info.setReturnValue(-1003941085);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1782868486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1782868486L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__8873424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-8873424L))
            info.setReturnValue("[&T&ETob:dIda3(䄞3;៕h>&sE}sW[?$T눙P堹Pꮷ㹺 }=%-j");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1164849293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1164849293L))
            info.setReturnValue(368842990);
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
