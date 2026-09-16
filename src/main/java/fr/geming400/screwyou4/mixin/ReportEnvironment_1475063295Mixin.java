package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.ReportEnvironment.class)
public class ReportEnvironment_1475063295Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_566437026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566437026L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2049480477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2049480477L))
            info.setReturnValue(")u+#a\uBFB9-+}KG9+91g\"L{>aK\u9A09gdU6Xj:|IKR\u6C2Fa]S@KGB.Gd\u8528PZ$U\"/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2032415385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032415385L))
            info.setReturnValue(628505429);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/client/multiplayer/chat/report/ReportEnvironment$Server;)Lnet/minecraft/client/multiplayer/chat/report/ReportEnvironment;", cancellable = true)
    private static void create_570722156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(570722156L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "local()Lnet/minecraft/client/multiplayer/chat/report/ReportEnvironment;", cancellable = true)
    private static void local__735703655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-735703655L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "server()Lnet/minecraft/client/multiplayer/chat/report/ReportEnvironment$Server;", cancellable = true)
    private void server__295123122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-295123122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "realm(Lcom/mojang/realmsclient/dto/RealmsServer;)Lnet/minecraft/client/multiplayer/chat/report/ReportEnvironment;", cancellable = true)
    private static void realm_1227440758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1227440758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clientVersion()Ljava/lang/String;", cancellable = true)
    private void clientVersion__501953452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-501953452L))
            info.setReturnValue(",{dERs$\uC935\u65BC\u7EC7  DnZ9M.('B(W\u3E95]*ldlX\u12EDxG]'thp:eQEg7aC(j\u2134lV2pp7Hjor[SuTk.xWizm6)Db8\u8B67\u1736s h?4\u9779\uAD19\u5DE5Y\u7BC3");
    }

    @Inject(at = @At("HEAD"), method = "clientInfo()Lcom/mojang/authlib/yggdrasil/request/AbuseReportRequest$ClientInfo;", cancellable = true)
    private void clientInfo__78987727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-78987727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "realmInfo()Lcom/mojang/authlib/yggdrasil/request/AbuseReportRequest$RealmInfo;", cancellable = true)
    private void realmInfo__270213277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-270213277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thirdParty(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/chat/report/ReportEnvironment;", cancellable = true)
    private static void thirdParty_888523491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(888523491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thirdPartyServerInfo()Lcom/mojang/authlib/yggdrasil/request/AbuseReportRequest$ThirdPartyServerInfo;", cancellable = true)
    private void thirdPartyServerInfo__1079214255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1079214255L))
            info.setReturnValue(null);
    }


}
