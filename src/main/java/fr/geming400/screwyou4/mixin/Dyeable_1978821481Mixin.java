package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.EquipmentClientInfo.Dyeable.class)
public class Dyeable_1978821481Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1070195212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1070195212L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1545722291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1545722291L))
            info.setReturnValue(" \u1E5EK4\u2B5APx\u34DA\u76FB\u2A86{IF\uC311JN6b_m8)|uRLPE4WXR\"gYe='l@64g5\u6DF1DJ\u956F%\"/}A$5*e4^Yj\u1441=Y\u7DCA-jVV&>f\u126FNF;hay");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1758793725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1758793725L))
            info.setReturnValue(782140406);
    }

    @Inject(at = @At("HEAD"), method = "colorWhenUndyed()Ljava/util/Optional;", cancellable = true)
    private void colorWhenUndyed_238915776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(238915776L))
            info.setReturnValue(null);
    }


}
