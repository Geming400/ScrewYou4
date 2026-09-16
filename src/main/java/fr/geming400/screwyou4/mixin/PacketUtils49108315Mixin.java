package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.PacketUtils.class)
public class PacketUtils49108315Mixin {
        @Inject(at = @At("HEAD"), method = "fillCrashReport(Lnet/minecraft/CrashReport;Lnet/minecraft/network/PacketListener;Lnet/minecraft/network/protocol/Packet;)V", cancellable = true)
    private static void fillCrashReport__487289555(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-487289555L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ensureRunningOnSameThread(Lnet/minecraft/network/protocol/Packet;Lnet/minecraft/network/PacketListener;Lnet/minecraft/network/PacketProcessor;)V", cancellable = true)
    private static void ensureRunningOnSameThread_303153325(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(303153325L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ensureRunningOnSameThread(Lnet/minecraft/network/protocol/Packet;Lnet/minecraft/network/PacketListener;Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private static void ensureRunningOnSameThread__1334565102(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1334565102L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "makeReportedException(Ljava/lang/Exception;Lnet/minecraft/network/protocol/Packet;Lnet/minecraft/network/PacketListener;)Lnet/minecraft/ReportedException;", cancellable = true)
    private static void makeReportedException__990184976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-990184976L))
            info.setReturnValue(null);
    }


}
