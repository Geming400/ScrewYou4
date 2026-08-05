package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.OverlayMetadataSection.class)
public class OverlayMetadataSection147017858Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1532530117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1532530117L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__988442117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-988442117L))
            info.setReturnValue("q<2萼vH疥3z坷(GT5Wrm0S쟴rJ霅L䆖4.'q!FN:=骥\"n)d$qcT^D偘]PV'륜-9hJ=EI1xISBZzEUyxS# 聸E%wB\"u94xHt Im+L,D_2qg<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_185280600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(185280600L))
            info.setReturnValue(-1985846434);
    }

    @Inject(at = @At("HEAD"), method = "overlays()Ljava/util/List;", cancellable = true)
    private void overlays_1773354674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1773354674L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overlaysForVersion(Lnet/minecraft/server/packs/metadata/pack/PackFormat;)Ljava/util/List;", cancellable = true)
    private void overlaysForVersion__1572891410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1572891410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codecForPackType(Lnet/minecraft/server/packs/PackType;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codecForPackType__268452311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-268452311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forPackType(Lnet/minecraft/server/packs/PackType;)Lnet/minecraft/server/packs/metadata/MetadataSectionType;", cancellable = true)
    private static void forPackType__456469960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-456469960L))
            info.setReturnValue(null);
    }


}
