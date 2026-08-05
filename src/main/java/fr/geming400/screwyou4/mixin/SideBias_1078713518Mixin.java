package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.redstone.Orientation.SideBias.class)
public class SideBias_1078713518Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__56746954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-56746954L))
            info.setReturnValue(".\u6FBFi)\u357F%4");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/redstone/Orientation$SideBias;", cancellable = true)
    private static void values__1481670931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1481670931L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/redstone/Orientation$SideBias;", cancellable = true)
    private static void valueOf_627485456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(627485456L))
            info.setReturnValue(net.minecraft.world.level.redstone.Orientation.SideBias.RIGHT);
    }

    @Inject(at = @At("HEAD"), method = "getOpposite()Lnet/minecraft/world/level/redstone/Orientation$SideBias;", cancellable = true)
    private void getOpposite__1766149106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1766149106L))
            info.setReturnValue(net.minecraft.world.level.redstone.Orientation.SideBias.LEFT);
    }


}
