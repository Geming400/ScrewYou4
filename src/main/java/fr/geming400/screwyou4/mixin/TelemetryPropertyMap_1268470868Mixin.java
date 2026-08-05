package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.TelemetryPropertyMap.class)
public class TelemetryPropertyMap_1268470868Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/client/telemetry/TelemetryProperty;)Ljava/lang/Object;", cancellable = true)
    private void get__87944323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-87944323L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2038893896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2038893896L))
            info.setReturnValue("@pLq\uA55B$(fY4\uA9F29(DXJ@[72=U7\u4B04h\uD70E\uF94A\uCB5EO&]WU");
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/client/telemetry/TelemetryPropertyMap$Builder;", cancellable = true)
    private static void builder__918928247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-918928247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCodec(Ljava/util/List;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void createCodec__2146780002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2146780002L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "propertySet()Ljava/util/Set;", cancellable = true)
    private void propertySet_1933481736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1933481736L))
            info.setReturnValue(null);
    }


}
