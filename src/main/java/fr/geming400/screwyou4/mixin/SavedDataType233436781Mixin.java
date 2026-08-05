package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.SavedDataType.class)
public class SavedDataType233436781Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1618948544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1618948544L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__902023690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-902023690L))
            info.setReturnValue("^+*\u917Cay9poT j@`\uC3F8");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_271699027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(271699027L))
            info.setReturnValue(-1666664682);
    }

    @Inject(at = @At("HEAD"), method = "constructor()Ljava/util/function/Supplier;", cancellable = true)
    private void constructor__235721810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-235721810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id_2085337524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2085337524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__158528845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-158528845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataFixType()Lnet/minecraft/util/datafix/DataFixTypes;", cancellable = true)
    private void dataFixType__806535962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-806535962L))
            info.setReturnValue(net.minecraft.util.datafix.DataFixTypes.DEBUG_PROFILE);
    }


}
