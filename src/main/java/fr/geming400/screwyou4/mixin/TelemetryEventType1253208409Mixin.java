package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.TelemetryEventType.class)
public class TelemetryEventType1253208409Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2023631438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2023631438L))
            info.setReturnValue("P85#_BiYpu_#L\\\"J'j-w`%S_f\u3CFB9h\uC620\uAC2B%!#^w|[]N-,\u0337D{BS$<I(\u3F3AK\uD01FHq:\uB96FR");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private static void values__1863837533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1863837533L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/telemetry/TelemetryEventType$Builder;", cancellable = true)
    private static void builder__2048318314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2048318314L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/client/telemetry/TelemetryProperty;)Z", cancellable = true)
    private void contains__350384968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-350384968L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_1594369981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1594369981L))
            info.setReturnValue("\u7A33!:^dmc2U/j^tYkwg;(Rnf/]|6J2yp!\u39B27?KV\"9G@YWO, )#.T{\uCB77H5%]/Kd");
    }

    @Inject(at = @At("HEAD"), method = "properties()Ljava/util/List;", cancellable = true)
    private void properties__845130436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-845130436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "export(Lcom/mojang/authlib/minecraft/TelemetrySession;Lnet/minecraft/client/telemetry/TelemetryPropertyMap;)Lcom/mojang/authlib/minecraft/TelemetryEvent;", cancellable = true)
    private void export__706054863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-706054863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void description_1503107688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1503107688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selfTest()Z", cancellable = true)
    private static void selfTest__866839350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-866839350L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "title()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void title_427323276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(427323276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1975313633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1975313633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOptIn()Z", cancellable = true)
    private void isOptIn_2073194402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2073194402L))
            info.setReturnValue(false);
    }


}
