package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.monitoring.jmx.MinecraftServerStatistics.class)
public class MinecraftServerStatistics_430987051Mixin {
        @Inject(at = @At("HEAD"), method = "invoke(Ljava/lang/String;[Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;", cancellable = true)
    private void invoke__998877531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-998877531L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getAttributes([Ljava/lang/String;)Ljavax/management/AttributeList;", cancellable = true)
    private void getAttributes__1372225905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1372225905L))
            info.setReturnValue(new javax.management.AttributeList());
    }

    @Inject(at = @At("HEAD"), method = "getAttribute(Ljava/lang/String;)Ljava/lang/Object;", cancellable = true)
    private void getAttribute_941413345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(941413345L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "setAttribute(Ljavax/management/Attribute;)V", cancellable = true)
    private void setAttribute__1763396151(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1763396151L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAttributes(Ljavax/management/AttributeList;)Ljavax/management/AttributeList;", cancellable = true)
    private void setAttributes_2061734978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2061734978L))
            info.setReturnValue(new javax.management.AttributeList());
    }

    @Inject(at = @At("HEAD"), method = "registerJmxMonitoring(Lnet/minecraft/server/MinecraftServer;)V", cancellable = true)
    private static void registerJmxMonitoring_1686671986(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1686671986L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMBeanInfo()Ljavax/management/MBeanInfo;", cancellable = true)
    private void getMBeanInfo_1550503157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1550503157L))
            info.setReturnValue(null);
    }


}
