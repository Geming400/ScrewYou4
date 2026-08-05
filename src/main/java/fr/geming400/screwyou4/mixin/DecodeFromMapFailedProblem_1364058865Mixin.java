package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueInput.DecodeFromMapFailedProblem.class)
public class DecodeFromMapFailedProblem_1364058865Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1545396173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1545396173L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_228598889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(228598889L))
            info.setReturnValue("]kTqZjCIF7(9Ni뚠/6o{4#gHF1!Åa(2Sx$]nys2CaI.Ph!l:M^l&щ-䰅2ro!pvf#I;5.Q&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1402321606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1402321606L))
            info.setReturnValue(-2063486714);
    }

    @Inject(at = @At("HEAD"), method = "error()Lcom/mojang/serialization/DataResult$Error;", cancellable = true)
    private void error_1816303515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1816303515L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description_228598393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(228598393L))
            info.setReturnValue("2Q%;c7t`Q2SK:0y蕣okZ$UZB$=3䴢5%7Y_Ⰵ<WX?B廫X 3#QMﰟ↶㪋!澃7J&遳8Ls/qﮭ@oK-UakVltA\"p/6Qk");
    }


}
