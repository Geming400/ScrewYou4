package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.navigation.ScreenAxis.class)
public class ScreenAxis995681787Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/navigation/ScreenAxis;", cancellable = true)
    private static void values_1710133972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1710133972L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/navigation/ScreenAxis;", cancellable = true)
    private static void valueOf_1404572763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1404572763L))
            info.setReturnValue(net.minecraft.client.gui.navigation.ScreenAxis.VERTICAL);
    }

    @Inject(at = @At("HEAD"), method = "getNegative()Lnet/minecraft/client/gui/navigation/ScreenDirection;", cancellable = true)
    private void getNegative__727822024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-727822024L))
            info.setReturnValue(net.minecraft.client.gui.navigation.ScreenDirection.DOWN);
    }

    @Inject(at = @At("HEAD"), method = "getDirection(Z)Lnet/minecraft/client/gui/navigation/ScreenDirection;", cancellable = true)
    private void getDirection_2026087190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2026087190L))
            info.setReturnValue(net.minecraft.client.gui.navigation.ScreenDirection.LEFT);
    }

    @Inject(at = @At("HEAD"), method = "getPositive()Lnet/minecraft/client/gui/navigation/ScreenDirection;", cancellable = true)
    private void getPositive_1821710324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1821710324L))
            info.setReturnValue(net.minecraft.client.gui.navigation.ScreenDirection.UP);
    }

    @Inject(at = @At("HEAD"), method = "orthogonal()Lnet/minecraft/client/gui/navigation/ScreenAxis;", cancellable = true)
    private void orthogonal_965828478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965828478L))
            info.setReturnValue(net.minecraft.client.gui.navigation.ScreenAxis.HORIZONTAL);
    }


}
