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
            info.setReturnValue("]䁚s\"1QzZ1TSM]@g&aq垲hﺛ;6WTvQhLO`5=]?1>锽'ⰶH'c&<-5Q㏬I噟GIQo4}둃톂<");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1666629639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1666629639L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_107365423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(107365423L))
            info.setReturnValue("DxDWB&JD&s掟;r5Vr(uO5jVuS:q샄c/e钬tØ[AN^n\"⫀w⤫a>y]/c⏹6ibV");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1281088140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1281088140L))
            info.setReturnValue(-1805958037);
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
