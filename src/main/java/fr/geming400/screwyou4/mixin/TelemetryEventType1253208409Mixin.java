package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.TelemetryEventType.class)
public class TelemetryEventType1253208409Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_117747938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(117747938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private static void values__1415421823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1415421823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/telemetry/TelemetryEventType$Builder;", cancellable = true)
    private static void builder_96139793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(96139793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/client/telemetry/TelemetryProperty;)Z", cancellable = true)
    private void contains__937182793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-937182793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_117747938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(117747938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "properties()Ljava/util/List;", cancellable = true)
    private void properties__1415422071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1415422071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "export(Lcom/mojang/authlib/minecraft/TelemetrySession;Lnet/minecraft/client/telemetry/TelemetryPropertyMap;)Lcom/mojang/authlib/minecraft/TelemetryEvent;", cancellable = true)
    private void export_1252733029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1252733029L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void description__1154795804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1154795804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "title()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void title__1154795804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1154795804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1305905163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1305905163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selfTest()Z", cancellable = true)
    private static void selfTest_1291487240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1291487240L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOptIn()Z", cancellable = true)
    private void isOptIn_1291486992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1291486992L))
            info.setReturnValue(null);
    }


}
