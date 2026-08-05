package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.ReportEnvironment.class)
public class ReportEnvironment_1475063295Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1434391743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1434391743L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_339603319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(339603319L))
            info.setReturnValue(">d|kbuYG:3xH2`jxk\u2A67NJo8\uA9FA:!\u79E1}|\uD563b2U3Z\uBB79#\uC195Tk\uAB78 \u6E91nuM$>JT");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1513326036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1513326036L))
            info.setReturnValue(1238536553);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/client/multiplayer/chat/report/ReportEnvironment$Server;)Lnet/minecraft/client/multiplayer/chat/report/ReportEnvironment;", cancellable = true)
    private static void create__1519673880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519673880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "local()Lnet/minecraft/client/multiplayer/chat/report/ReportEnvironment;", cancellable = true)
    private static void local_661173166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(661173166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "server()Lnet/minecraft/client/multiplayer/chat/report/ReportEnvironment$Server;", cancellable = true)
    private void server_272987761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(272987761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "realm(Lcom/mojang/realmsclient/dto/RealmsServer;)Lnet/minecraft/client/multiplayer/chat/report/ReportEnvironment;", cancellable = true)
    private static void realm__1622179289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1622179289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clientVersion()Ljava/lang/String;", cancellable = true)
    private void clientVersion_339602823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(339602823L))
            info.setReturnValue("QgIlErfFGxOb1\uA422\u2556@ya!%@0d Ni\uA3166h\u7ADAR`+\u7149zx7&S{Fr\uADCE)g\u7498!-kb)lRT\uBFD8");
    }

    @Inject(at = @At("HEAD"), method = "clientInfo()Lcom/mojang/authlib/yggdrasil/request/AbuseReportRequest$ClientInfo;", cancellable = true)
    private void clientInfo_1556561944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1556561944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "realmInfo()Lcom/mojang/authlib/yggdrasil/request/AbuseReportRequest$RealmInfo;", cancellable = true)
    private void realmInfo_1804398048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1804398048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thirdParty(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/chat/report/ReportEnvironment;", cancellable = true)
    private static void thirdParty_1111998052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1111998052L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thirdPartyServerInfo()Lcom/mojang/authlib/yggdrasil/request/AbuseReportRequest$ThirdPartyServerInfo;", cancellable = true)
    private void thirdPartyServerInfo__1941604959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1941604959L))
            info.setReturnValue(null);
    }


}
