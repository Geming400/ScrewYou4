package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.variant.PriorityProvider.UnpackedEntry.class)
public class UnpackedEntry_1126586552Mixin {
        @Inject(at = @At("HEAD"), method = "priority()I", cancellable = true)
    private void priority_1914968953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1914968953L))
            info.setReturnValue(-797130645);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_217960283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(217960283L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1897010076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897010076L))
            info.setReturnValue("h\u614Et7snOj==v}2yn%Z\u78B4\uD503ChmfV T:yUn>mykHz\u85660-|\uCF50x@\uD5D5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1683938642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1683938642L))
            info.setReturnValue(717739065);
    }

    @Inject(at = @At("HEAD"), method = "entry()Ljava/lang/Object;", cancellable = true)
    private void entry_1247454532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1247454532L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "condition()Lnet/minecraft/world/entity/variant/PriorityProvider$SelectorCondition;", cancellable = true)
    private void condition_339295534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(339295534L))
            info.setReturnValue(null);
    }


}
