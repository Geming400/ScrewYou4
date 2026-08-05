package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.Tilt.class)
public class Tilt_913659735Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/Tilt;", cancellable = true)
    private static void values_726856254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(726856254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/Tilt;", cancellable = true)
    private static void valueOf_415562455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415562455L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.Tilt.NONE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1001868356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1001868356L))
            info.setReturnValue("\u741FPSkTHYQcKHOU\u3803l\u6831dKxii\uC4B0]\u0449S=@e)2");
    }

    @Inject(at = @At("HEAD"), method = "causesVibration()Z", cancellable = true)
    private void causesVibration_583883141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(583883141L))
            info.setReturnValue(true);
    }


}
