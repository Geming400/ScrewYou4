package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.metadata.pack.PackFormat.class)
public class PackFormat2047980440Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1139354172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1139354172L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1476563827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1476563827L))
            info.setReturnValue("j))\u4C8E+l46{5\u40F0tQS.!LA\u00F9Q)\u5B51Y2w?g|\u7053cT\uC743M\u0DE9@x^m/?'*^gh(U\u2BDCST0]&\u0934fH\u7262@VVlKMD:bh\u3387@bhaMRD<}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1689634765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1689634765L))
            info.setReturnValue(1013102077);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo_155876506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(155876506L))
            info.setReturnValue(-1295569315);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lnet/minecraft/server/packs/metadata/pack/PackFormat;)I", cancellable = true)
    private void compareTo_559633666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(559633666L))
            info.setReturnValue(338311233);
    }

    @Inject(at = @At("HEAD"), method = "of(II)Lnet/minecraft/server/packs/metadata/pack/PackFormat;", cancellable = true)
    private static void of__1228024982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1228024982L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(I)Lnet/minecraft/server/packs/metadata/pack/PackFormat;", cancellable = true)
    private static void of__177799791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-177799791L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "major()I", cancellable = true)
    private void major_1663401829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1663401829L))
            info.setReturnValue(308908339);
    }

    @Inject(at = @At("HEAD"), method = "minor()I", cancellable = true)
    private void minor__1530025239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1530025239L))
            info.setReturnValue(515869724);
    }

    @Inject(at = @At("HEAD"), method = "packCodec(Lnet/minecraft/server/packs/PackType;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void packCodec__698185696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-698185696L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minorRange()Lnet/minecraft/util/InclusiveRange;", cancellable = true)
    private void minorRange_103446410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(103446410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lastPreMinorVersion(Lnet/minecraft/server/packs/PackType;)I", cancellable = true)
    private static void lastPreMinorVersion__671951011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-671951011L))
            info.setReturnValue(1339201996);
    }

    @Inject(at = @At("HEAD"), method = "validateHolderList(Ljava/util/List;ILjava/util/function/BiFunction;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void validateHolderList_556675000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(556675000L))
            info.setReturnValue(null);
    }


}
