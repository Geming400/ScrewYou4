package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.AdultAndBabyModelPair.class)
public class AdultAndBabyModelPair_441561582Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__467064687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-467064687L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1211985106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211985106L))
            info.setReturnValue("\u59E7\"5m\u9A5E)\u53E6iC-h StAdao-I@0O0\"}BS\u4ED7AWLA$;\uBCCC@Wi>\u8000W\u6009?\uCDDEN_#lxJ6e4\uD626)7N))P\u790CxP+ZZ\u5F3C56{");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_998913672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(998913672L))
            info.setReturnValue(972045804);
    }

    @Inject(at = @At("HEAD"), method = "babyModel()Lnet/minecraft/client/model/Model;", cancellable = true)
    private void babyModel_994185787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(994185787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "adultModel()Lnet/minecraft/client/model/Model;", cancellable = true)
    private void adultModel__989966633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-989966633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModel(Z)Lnet/minecraft/client/model/Model;", cancellable = true)
    private void getModel_2027466987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2027466987L))
            info.setReturnValue(null);
    }


}
