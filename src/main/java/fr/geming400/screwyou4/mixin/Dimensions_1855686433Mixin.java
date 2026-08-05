package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.UnihexProvider.Dimensions.class)
public class Dimensions_1855686433Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1053768605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1053768605L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_720226457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(720226457L))
            info.setReturnValue("7⫲Yij#s蔫6K(GxNgsKcf/ં3UgCR>L4]`E=!(/pM题墽a?wQK/m{g");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1893949174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1893949174L))
            info.setReturnValue(-179020284);
    }

    @Inject(at = @At("HEAD"), method = "left(I)I", cancellable = true)
    private static void left__1225376137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1225376137L))
            info.setReturnValue(-1799766495);
    }

    @Inject(at = @At("HEAD"), method = "left()I", cancellable = true)
    private void left_1893948678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1893948678L))
            info.setReturnValue(97998924);
    }

    @Inject(at = @At("HEAD"), method = "right()I", cancellable = true)
    private void right_1893948678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1893948678L))
            info.setReturnValue(97998924);
    }

    @Inject(at = @At("HEAD"), method = "right(I)I", cancellable = true)
    private static void right__1225376137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1225376137L))
            info.setReturnValue(-1799766495);
    }

    @Inject(at = @At("HEAD"), method = "pack()I", cancellable = true)
    private void pack_1893948678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1893948678L))
            info.setReturnValue(97998924);
    }

    @Inject(at = @At("HEAD"), method = "pack(II)I", cancellable = true)
    private static void pack_859794718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(859794718L))
            info.setReturnValue(-431021325);
    }


}
