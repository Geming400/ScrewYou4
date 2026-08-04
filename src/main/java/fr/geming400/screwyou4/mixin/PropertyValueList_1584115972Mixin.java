package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.blockstates.PropertyValueList.class)
public class PropertyValueList_1584115972Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1325339066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1325339066L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_448655500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(448655500L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private void values__1084514509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1084514509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1622378713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1622378713L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of([Lnet/minecraft/world/level/block/state/properties/Property$Value;)Lnet/minecraft/client/data/models/blockstates/PropertyValueList;", cancellable = true)
    private static void of__1897078187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1897078187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getKey()Ljava/lang/String;", cancellable = true)
    private void getKey_448655500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(448655500L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extend(Lnet/minecraft/client/data/models/blockstates/PropertyValueList;)Lnet/minecraft/client/data/models/blockstates/PropertyValueList;", cancellable = true)
    private void extend_63258338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(63258338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extend(Lnet/minecraft/world/level/block/state/properties/Property$Value;)Lnet/minecraft/client/data/models/blockstates/PropertyValueList;", cancellable = true)
    private void extend__291505582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-291505582L))
            info.setReturnValue(null);
    }


}
