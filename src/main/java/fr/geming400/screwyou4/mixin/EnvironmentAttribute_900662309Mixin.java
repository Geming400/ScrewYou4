package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.EnvironmentAttribute.class)
public class EnvironmentAttribute_900662309Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/attribute/AttributeType;", cancellable = true)
    private void type__852314570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-852314570L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__234798163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-234798163L))
            info.setReturnValue("S\u6D4ArCv*:HWy*(\u48CCi\u1419C#Bdq%w8\uA7CC\uCF61x=EcHOz+|OMSDT@B\"Y80\uA9CB:R.\u0384}\uCBDBc2,<-G*k&@CDs#\u1F1DWW=P\uA7C5@c\u5F93cj?K>[`\u6AA0wRT+Fv5Xqq,");
    }

    @Inject(at = @At("HEAD"), method = "builder(Lnet/minecraft/world/attribute/AttributeType;)Lnet/minecraft/world/attribute/EnvironmentAttribute$Builder;", cancellable = true)
    private static void builder_770132097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(770132097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultValue()Ljava/lang/Object;", cancellable = true)
    private void defaultValue__1535112769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1535112769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec_508696682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508696682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSyncable()Z", cancellable = true)
    private void isSyncable_938940891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(938940891L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPositional()Z", cancellable = true)
    private void isPositional_938940891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(938940891L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isSpatiallyInterpolated()Z", cancellable = true)
    private void isSpatiallyInterpolated_938940891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(938940891L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "sanitizeValue(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void sanitizeValue_912740259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(912740259L))
            info.setReturnValue(null);
    }


}
