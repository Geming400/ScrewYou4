package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.monitoring.jmx.MinecraftServerStatistics.class)
public class MinecraftServerStatistics_430987051Mixin {
        @Inject(at = @At("HEAD"), method = "invoke(Ljava/lang/String;[Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;", cancellable = true)
    private void invoke__750713811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-750713811L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getAttributes([Ljava/lang/String;)Ljavax/management/AttributeList;", cancellable = true)
    private void getAttributes__442101124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-442101124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAttribute(Ljava/lang/String;)Ljava/lang/Object;", cancellable = true)
    private void getAttribute_343414267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(343414267L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "setAttribute(Ljavax/management/Attribute;)V", cancellable = true)
    private void setAttribute_2025266915(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2025266915L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAttributes(Ljavax/management/AttributeList;)Ljavax/management/AttributeList;", cancellable = true)
    private void setAttributes__925007511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-925007511L))
            info.setReturnValue(new javax.management.AttributeList());
    }

    @Inject(at = @At("HEAD"), method = "getMBeanInfo()Ljavax/management/MBeanInfo;", cancellable = true)
    private void getMBeanInfo_2123543456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2123543456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerJmxMonitoring(Lnet/minecraft/server/MinecraftServer;)V", cancellable = true)
    private static void registerJmxMonitoring__2121744756(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2121744756L))
            info.cancel();
    }


}
