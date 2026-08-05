package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.CaveSurface.class)
public class CaveSurface_1397848222Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/placement/CaveSurface;", cancellable = true)
    private static void values_717874989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(717874989L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/placement/CaveSurface;", cancellable = true)
    private static void valueOf_1677213546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1677213546L))
            info.setReturnValue(net.minecraft.world.level.levelgen.placement.CaveSurface.FLOOR);
    }

    @Inject(at = @At("HEAD"), method = "getY()I", cancellable = true)
    private void getY_1436110467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1436110467L))
            info.setReturnValue(453645578);
    }

    @Inject(at = @At("HEAD"), method = "getDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getDirection_634992936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(634992936L))
            info.setReturnValue(net.minecraft.core.Direction.DOWN);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_262387750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(262387750L))
            info.setReturnValue("#,:@GZ\uCBDAH^Ej\u620Dj}\u963DvW\u21E0y\u5DF2\u56B4\uD5E2oZ{hL");
    }


}
