package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.Report.Result.class)
public class Result1641080695Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_732454427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(732454427L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1883463076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1883463076L))
            info.setReturnValue("3O");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2096534510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2096534510L))
            info.setReturnValue(1470958114);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/util/UUID;", cancellable = true)
    private void id__1830042843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1830042843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "report()Lcom/mojang/authlib/minecraft/report/AbuseReport;", cancellable = true)
    private void report__1449343259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1449343259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reportType()Lnet/minecraft/client/multiplayer/chat/report/ReportType;", cancellable = true)
    private void reportType__832383306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-832383306L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.report.ReportType.SKIN);
    }


}
