package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.StatePropertiesPredicate.class)
public class StatePropertiesPredicate2095954535Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1187328267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1187328267L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1428589236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1428589236L))
            info.setReturnValue("'i(%!e}BA=7D_K$%\uC75F,y5j\u1CE4,iRGJ|\u5512[:Dq+c,jUHYIO\u3F24?`\"|.\u2FBCuU)uy8djj}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1641660670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1641660670L))
            info.setReturnValue(-711151744);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void matches_489829141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(489829141L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/block/state/StateDefinition;Lnet/minecraft/world/level/block/state/StateHolder;)Z", cancellable = true)
    private void matches__970609422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-970609422L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void matches_143828154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143828154L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "properties()Ljava/util/List;", cancellable = true)
    private void properties__2384310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2384310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkState(Lnet/minecraft/world/level/block/state/StateDefinition;)Ljava/util/Optional;", cancellable = true)
    private void checkState_1268489725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1268489725L))
            info.setReturnValue(null);
    }


}
