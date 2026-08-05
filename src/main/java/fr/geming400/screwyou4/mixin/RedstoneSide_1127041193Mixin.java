package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.RedstoneSide.class)
public class RedstoneSide_1127041193Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__8419279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-8419279L))
            info.setReturnValue("$ANB⽄m|?reun]W+rmo8 `)kL=ivA@=YVw핆㘒iG&K}6O믗yB\"y&=ue 5q0zFK?ef4(2");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/RedstoneSide;", cancellable = true)
    private static void values__1545628288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1545628288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/RedstoneSide;", cancellable = true)
    private static void valueOf__1979720861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1979720861L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.RedstoneSide.SIDE);
    }

    @Inject(at = @At("HEAD"), method = "isConnected()Z", cancellable = true)
    private void isConnected_1165319775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1165319775L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__8419279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-8419279L))
            info.setReturnValue("$ANB⽄m|?reun]W+rmo8 `)kL=ivA@=YVw핆㘒iG&K}6O믗yB\"y&=ue 5q0zFK?ef4(2");
    }


}
