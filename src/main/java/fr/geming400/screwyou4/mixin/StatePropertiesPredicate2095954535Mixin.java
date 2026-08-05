package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.StatePropertiesPredicate.class)
public class StatePropertiesPredicate2095954535Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__813500502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-813500502L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_960494560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(960494560L))
            info.setReturnValue("zL;Nob@258tA$eREar/.|f^[HW mSeh\u9FB7]o\"JP?<Mt\u458E\uBBB6`hn\uCE6EwSS d5\u5E58Vm");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2134217277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2134217277L))
            info.setReturnValue(616335438);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void matches__1838887582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1838887582L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/block/state/StateDefinition;Lnet/minecraft/world/level/block/state/StateHolder;)Z", cancellable = true)
    private void matches_19857029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(19857029L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void matches_1950665549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1950665549L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "properties()Ljava/util/List;", cancellable = true)
    private void properties__572675945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-572675945L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkState(Lnet/minecraft/world/level/block/state/StateDefinition;)Ljava/util/Optional;", cancellable = true)
    private void checkState__1694815866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1694815866L))
            info.setReturnValue(null);
    }


}
