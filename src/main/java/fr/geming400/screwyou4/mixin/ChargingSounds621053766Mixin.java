package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.CrossbowItem.ChargingSounds.class)
public class ChargingSounds621053766Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__287572502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-287572502L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1391477291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1391477291L))
            info.setReturnValue("BIT /W@D$9\u1FCA*ju\u60B8F[S\u0BEEqf");
    }

    @Inject(at = @At("HEAD"), method = "mid()Ljava/util/Optional;", cancellable = true)
    private void mid_2836284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2836284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1178405857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1178405857L))
            info.setReturnValue(-859525683);
    }

    @Inject(at = @At("HEAD"), method = "end()Ljava/util/Optional;", cancellable = true)
    private void end_1054957775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054957775L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start()Ljava/util/Optional;", cancellable = true)
    private void start_1369585494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1369585494L))
            info.setReturnValue(null);
    }


}
