package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.PacketUtils.class)
public class PacketUtils49108315Mixin {
        @Inject(at = @At("HEAD"), method = "makeReportedException(Ljava/lang/Exception;Lnet/minecraft/network/protocol/Packet;Lnet/minecraft/network/PacketListener;)Lnet/minecraft/ReportedException;", cancellable = true)
    private static void makeReportedException__690803170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-690803170L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillCrashReport(Lnet/minecraft/CrashReport;Lnet/minecraft/network/PacketListener;Lnet/minecraft/network/protocol/Packet;)V", cancellable = true)
    private static void fillCrashReport_1107644517(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1107644517L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ensureRunningOnSameThread(Lnet/minecraft/network/protocol/Packet;Lnet/minecraft/network/PacketListener;Lnet/minecraft/network/PacketProcessor;)V", cancellable = true)
    private static void ensureRunningOnSameThread__1703317955(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1703317955L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ensureRunningOnSameThread(Lnet/minecraft/network/protocol/Packet;Lnet/minecraft/network/PacketListener;Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private static void ensureRunningOnSameThread_889334658(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(889334658L))
            info.cancel();
    }


}
