package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.EquipmentClientInfo.Dyeable.class)
public class Dyeable_1978821481Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__930633557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-930633557L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_843361505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(843361505L))
            info.setReturnValue("\u9452o\uB1E0q%&Iy}}TS9`;\u1CEECP7T\u81C1)5lry+:7m]Cx%t\u5592%XV@{K&*F&f)\u1D9DS\uFE69XQU\u61852VM$70_;bp\"{h;'\u69D7RpS\uC6EDYHOeh9w\u622Cm]3");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2017084222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017084222L))
            info.setReturnValue(1873849788);
    }

    @Inject(at = @At("HEAD"), method = "colorWhenUndyed()Ljava/util/Optional;", cancellable = true)
    private void colorWhenUndyed__2070684394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2070684394L))
            info.setReturnValue(null);
    }


}
