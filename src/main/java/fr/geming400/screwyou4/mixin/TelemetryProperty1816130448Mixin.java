package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.TelemetryProperty.class)
public class TelemetryProperty1816130448Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1093324589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1093324589L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_680669977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(680669977L))
            info.setReturnValue("LDs-UjKeA8");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1854393190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1854393190L))
            info.setReturnValue(-1209874046);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_680669977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(680669977L))
            info.setReturnValue("LDs-UjKeA8");
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Ljava/lang/String;Lcom/mojang/serialization/Codec;Lnet/minecraft/client/telemetry/TelemetryProperty$Exporter;)Lnet/minecraft/client/telemetry/TelemetryProperty;", cancellable = true)
    private static void create_2004964111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2004964111L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeLong(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/telemetry/TelemetryProperty;", cancellable = true)
    private static void makeLong_1606306522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1606306522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "string(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/telemetry/TelemetryProperty;", cancellable = true)
    private static void string_1606306522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1606306522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "export(Lnet/minecraft/client/telemetry/TelemetryPropertyMap;Lcom/mojang/authlib/minecraft/TelemetryPropertyContainer;)V", cancellable = true)
    private void export_183271713(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(183271713L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "integer(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/telemetry/TelemetryProperty;", cancellable = true)
    private static void integer_1606306522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1606306522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bool(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/telemetry/TelemetryProperty;", cancellable = true)
    private static void bool_1606306522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1606306522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exporter()Lnet/minecraft/client/telemetry/TelemetryProperty$Exporter;", cancellable = true)
    private void exporter__1946744073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1946744073L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exportKey()Ljava/lang/String;", cancellable = true)
    private void exportKey_680669977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(680669977L))
            info.setReturnValue("LDs-UjKeA8");
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_1424164822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1424164822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uuid(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/telemetry/TelemetryProperty;", cancellable = true)
    private static void uuid_1606306522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1606306522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "title()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void title__591873765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-591873765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "longSamples(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/telemetry/TelemetryProperty;", cancellable = true)
    private static void longSamples_1606306522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1606306522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameLoadMeasurement(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/telemetry/TelemetryProperty;", cancellable = true)
    private static void gameLoadMeasurement_1606306522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1606306522L))
            info.setReturnValue(null);
    }


}
