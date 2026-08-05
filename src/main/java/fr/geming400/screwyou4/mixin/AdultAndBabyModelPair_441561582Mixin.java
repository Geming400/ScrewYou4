package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.AdultAndBabyModelPair.class)
public class AdultAndBabyModelPair_441561582Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1827073840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1827073840L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__693898394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-693898394L))
            info.setReturnValue("OxBX%5Wv\uA7A851W>-`QuBu9FhG;+RN!\u4561kV-a=S$d7\\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_479824323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(479824323L))
            info.setReturnValue(-2139923302);
    }

    @Inject(at = @At("HEAD"), method = "adultModel()Lnet/minecraft/client/model/Model;", cancellable = true)
    private void adultModel_1704002696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1704002696L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModel(Z)Lnet/minecraft/client/model/Model;", cancellable = true)
    private void getModel__807780930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-807780930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "babyModel()Lnet/minecraft/client/model/Model;", cancellable = true)
    private void babyModel_1704002696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1704002696L))
            info.setReturnValue(null);
    }


}
