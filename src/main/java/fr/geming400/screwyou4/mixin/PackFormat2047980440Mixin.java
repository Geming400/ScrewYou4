package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.metadata.pack.PackFormat.class)
public class PackFormat2047980440Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__861474597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-861474597L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_912519969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(912519969L))
            info.setReturnValue(";B7y&,<,H䑟 Zr;Ro.tn[m#=rk>`pRIY쭣trW|, #Pf0icD厃jR#gO잟\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2086243182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2086243182L))
            info.setReturnValue(-1103083048);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo__861362470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-861362470L))
            info.setReturnValue(726883787);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lnet/minecraft/server/packs/metadata/pack/PackFormat;)I", cancellable = true)
    private void compareTo__1605696830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1605696830L))
            info.setReturnValue(348602921);
    }

    @Inject(at = @At("HEAD"), method = "of(II)Lnet/minecraft/server/packs/metadata/pack/PackFormat;", cancellable = true)
    private static void of_2018128801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2018128801L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(I)Lnet/minecraft/server/packs/metadata/pack/PackFormat;", cancellable = true)
    private static void of__1320011142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1320011142L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "major()I", cancellable = true)
    private void major_2086242686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2086242686L))
            info.setReturnValue(-899935629);
    }

    @Inject(at = @At("HEAD"), method = "minor()I", cancellable = true)
    private void minor_2086242686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2086242686L))
            info.setReturnValue(-899935629);
    }

    @Inject(at = @At("HEAD"), method = "minorRange()Lnet/minecraft/util/InclusiveRange;", cancellable = true)
    private void minorRange_1430989586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1430989586L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packCodec(Lnet/minecraft/server/packs/PackType;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void packCodec__662692317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-662692317L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lastPreMinorVersion(Lnet/minecraft/server/packs/PackType;)I", cancellable = true)
    private static void lastPreMinorVersion__655107283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-655107283L))
            info.setReturnValue(-1007579848);
    }

    @Inject(at = @At("HEAD"), method = "validateHolderList(Ljava/util/List;ILjava/util/function/BiFunction;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void validateHolderList__988128808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-988128808L))
            info.setReturnValue(null);
    }


}
