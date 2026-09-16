package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.NoiseSettings.class)
public class NoiseSettings613824767Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__294801501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-294801501L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1384248292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1384248292L))
            info.setReturnValue("t;T496iOKV\u1653=]pf-D2\u8FF3L5l\u12EDwn");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1171176858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1171176858L))
            info.setReturnValue(-947222747);
    }

    @Inject(at = @At("HEAD"), method = "create(IIII)Lnet/minecraft/world/level/levelgen/NoiseSettings;", cancellable = true)
    private static void create__981846581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-981846581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCellHeight()I", cancellable = true)
    private void getCellHeight__431768282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-431768282L))
            info.setReturnValue(138969859);
    }

    @Inject(at = @At("HEAD"), method = "getCellWidth()I", cancellable = true)
    private void getCellWidth__1440682793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1440682793L))
            info.setReturnValue(-165487317);
    }

    @Inject(at = @At("HEAD"), method = "clampToHeightAccessor(Lnet/minecraft/world/level/LevelHeightAccessor;)Lnet/minecraft/world/level/levelgen/NoiseSettings;", cancellable = true)
    private void clampToHeightAccessor__2084371982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2084371982L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minY()I", cancellable = true)
    private void minY_908689150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(908689150L))
            info.setReturnValue(1568892394);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height__471523810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-471523810L))
            info.setReturnValue(-1244833878);
    }

    @Inject(at = @At("HEAD"), method = "noiseSizeHorizontal()I", cancellable = true)
    private void noiseSizeHorizontal__1880410746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1880410746L))
            info.setReturnValue(-1552134002);
    }

    @Inject(at = @At("HEAD"), method = "noiseSizeVertical()I", cancellable = true)
    private void noiseSizeVertical__536941900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-536941900L))
            info.setReturnValue(-1628155018);
    }


}
