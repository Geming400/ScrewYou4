package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.TelemetryProperty.class)
public class TelemetryProperty1816130448Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_907504180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(907504180L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1708413819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1708413819L))
            info.setReturnValue("MMEIvH;#sD.f\u4075/\u6225!9\u1332Q8wYA`\u1237s ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1921484757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1921484757L))
            info.setReturnValue(54127582);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id__2137675276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2137675276L))
            info.setReturnValue("7TS \u7108\u7A7BRm\u87CA8tXm>X|[yWi`p1=cydT\u776Af!,%m15\"$R\u5400K&u\uCD8AOON2z^\uD5E3?Ps;g,7U!U,hh+ Lp-b\uAD90H5/i`r.wE.N}0\u6398V5");
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Ljava/lang/String;Lcom/mojang/serialization/Codec;Lnet/minecraft/client/telemetry/TelemetryProperty$Exporter;)Lnet/minecraft/client/telemetry/TelemetryProperty;", cancellable = true)
    private static void create_2040797075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2040797075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeLong(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/telemetry/TelemetryProperty;", cancellable = true)
    private static void makeLong__1655874588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1655874588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "string(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/telemetry/TelemetryProperty;", cancellable = true)
    private static void string__1905344597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1905344597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "export(Lnet/minecraft/client/telemetry/TelemetryPropertyMap;Lcom/mojang/authlib/minecraft/TelemetryPropertyContainer;)V", cancellable = true)
    private void export__1522485011(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1522485011L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "integer(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/telemetry/TelemetryProperty;", cancellable = true)
    private static void integer__244733288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-244733288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bool(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/telemetry/TelemetryProperty;", cancellable = true)
    private static void bool__1203174076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1203174076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameLoadMeasurement(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/telemetry/TelemetryProperty;", cancellable = true)
    private static void gameLoadMeasurement__759463298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-759463298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "longSamples(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/telemetry/TelemetryProperty;", cancellable = true)
    private static void longSamples_1959047815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1959047815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uuid(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/telemetry/TelemetryProperty;", cancellable = true)
    private static void uuid_1498768085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1498768085L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "title()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void title_990245315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(990245315L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_11420908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(11420908L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exporter()Lnet/minecraft/client/telemetry/TelemetryProperty$Exporter;", cancellable = true)
    private void exporter_707927926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(707927926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exportKey()Ljava/lang/String;", cancellable = true)
    private void exportKey__877113628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-877113628L))
            info.setReturnValue("N");
    }


}
