package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.OverlayMetadataSection.class)
public class OverlayMetadataSection147017858Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__761608410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-761608410L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_917441383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(917441383L))
            info.setReturnValue("n");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_704369949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(704369949L))
            info.setReturnValue(1465857923);
    }

    @Inject(at = @At("HEAD"), method = "overlays()Ljava/util/List;", cancellable = true)
    private void overlays__2091772587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2091772587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overlaysForVersion(Lnet/minecraft/server/packs/metadata/pack/PackFormat;)Ljava/util/List;", cancellable = true)
    private void overlaysForVersion_562440924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(562440924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forPackType(Lnet/minecraft/server/packs/PackType;)Lnet/minecraft/server/packs/metadata/MetadataSectionType;", cancellable = true)
    private static void forPackType_216499220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(216499220L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codecForPackType(Lnet/minecraft/server/packs/PackType;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codecForPackType__1781220861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1781220861L))
            info.setReturnValue(null);
    }


}
