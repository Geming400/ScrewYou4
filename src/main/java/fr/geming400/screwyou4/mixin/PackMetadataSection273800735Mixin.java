package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.metadata.pack.PackMetadataSection.class)
public class PackMetadataSection273800735Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1659312994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1659312994L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__861659240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-861659240L))
            info.setReturnValue("jJb_Vh;?/\u8247a;*NiyRvy)Z9tkj]PiYFh*;ofY6m8 -i^\uFE28],_v");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_312063477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(312063477L))
            info.setReturnValue(1315316139);
    }

    @Inject(at = @At("HEAD"), method = "supportedFormats()Lnet/minecraft/util/InclusiveRange;", cancellable = true)
    private void supportedFormats__343190119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-343190119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void description__1903108430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1903108430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forPackType(Lnet/minecraft/server/packs/PackType;)Lnet/minecraft/server/packs/metadata/MetadataSectionType;", cancellable = true)
    private static void forPackType__329687083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-329687083L))
            info.setReturnValue(null);
    }


}
