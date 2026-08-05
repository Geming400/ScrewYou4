package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.action.CustomAll.class)
public class CustomAll_1896749134Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1012705904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1012705904L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_761289158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(761289158L))
            info.setReturnValue("+ D㳋jfFv炃=5 ^2XfQwijeX7괿U>7ﾆ46-G_AI|`o$1^ㆋh/PO,xrw'0DGon%eItP[GDSxEVd<k3cda.k,PAQ}{\"H27.!$");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1935011875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1935011875L))
            info.setReturnValue(1818090168);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__546317420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-546317420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__662364439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-662364439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAction(Ljava/util/Map;)Ljava/util/Optional;", cancellable = true)
    private void createAction__1010517792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1010517792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "additions()Ljava/util/Optional;", cancellable = true)
    private void additions_2142210555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2142210555L))
            info.setReturnValue(null);
    }


}
