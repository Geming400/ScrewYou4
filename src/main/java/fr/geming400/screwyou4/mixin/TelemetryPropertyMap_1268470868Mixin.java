package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.TelemetryPropertyMap.class)
public class TelemetryPropertyMap_1268470868Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/client/telemetry/TelemetryProperty;)Ljava/lang/Object;", cancellable = true)
    private void get__1883772377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1883772377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_133010396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(133010396L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/client/telemetry/TelemetryPropertyMap$Builder;", cancellable = true)
    private static void builder__608114492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-608114492L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCodec(Ljava/util/List;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void createCodec__1003324840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1003324840L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "propertySet()Ljava/util/Set;", cancellable = true)
    private void propertySet__560564619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-560564619L))
            info.setReturnValue(null);
    }


}
