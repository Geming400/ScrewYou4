package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.Report.Result.class)
public class Result1641080695Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1268374342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1268374342L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_505620720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(505620720L))
            info.setReturnValue("tu 㠔':xb?f縁Nz2t#E}8L");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1679343437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1679343437L))
            info.setReturnValue(968246476);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/util/UUID;", cancellable = true)
    private void id_2052215178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2052215178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "report()Lcom/mojang/authlib/minecraft/report/AbuseReport;", cancellable = true)
    private void report_1808286617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1808286617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reportType()Lnet/minecraft/client/multiplayer/chat/report/ReportType;", cancellable = true)
    private void reportType__1992635772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1992635772L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.report.ReportType.CHAT);
    }


}
