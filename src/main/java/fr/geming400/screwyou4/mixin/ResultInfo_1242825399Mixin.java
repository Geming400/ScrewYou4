package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.api.ResultInfo.class)
public class ResultInfo_1242825399Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_107364927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(107364927L))
            info.setReturnValue("]\u405As\"1QzZ1TSM]@g&aq\u57B2h\uFE9B;6WTvQhLO`5=]?1>\u953D'\u2C36H'c&<-5Q\u33ECI\u565FGIQo4}\uB443\uD182<");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1666629639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1666629639L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_107365423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(107365423L))
            info.setReturnValue("DxDWB&JD&s\u639F;r5Vr(uO5jVuS:q\uC0C4c/e\u94ACt\u00D8[AN^n\"\u2AC0w\u292Ba>y]/c\u23F96ibV");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1281088140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1281088140L))
            info.setReturnValue(-2005876537);
    }

    @Inject(at = @At("HEAD"), method = "schema()Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private void schema__760472390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-760472390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "typedCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void typedCodec_850860020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(850860020L))
            info.setReturnValue(null);
    }


}
