package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.redstone.Orientation.SideBias.class)
public class SideBias_1078713518Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1849136546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1849136546L))
            info.setReturnValue("YN_z\u8BD2\u0FC0`1\u59FBIE+buNsj9H4\u6E64mx$H\uB8A4A3\uD16FV{,");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/redstone/Orientation$SideBias;", cancellable = true)
    private static void values__1593840497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1593840497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/redstone/Orientation$SideBias;", cancellable = true)
    private static void valueOf__99470616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-99470616L))
            info.setReturnValue(net.minecraft.world.level.redstone.Orientation.SideBias.RIGHT);
    }

    @Inject(at = @At("HEAD"), method = "getOpposite()Lnet/minecraft/world/level/redstone/Orientation$SideBias;", cancellable = true)
    private void getOpposite_481709265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(481709265L))
            info.setReturnValue(net.minecraft.world.level.redstone.Orientation.SideBias.LEFT);
    }


}
