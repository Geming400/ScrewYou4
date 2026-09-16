package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.metadata.pack.PackMetadataSection.class)
public class PackMetadataSection273800735Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__634825533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-634825533L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1044224260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1044224260L))
            info.setReturnValue("%\u56554m&}\uCC99*oC!hf\u3009\uC47F?l\u4F20 )i=7uFt,*#h&UH{qMif3\u413F4GF\u01C6$eo9jne]\u4D0BU\u7C3AX\uA38F/J)W\u4A5C\u9DD7sKl\u0F34<?};,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_831152826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(831152826L))
            info.setReturnValue(-1379973349);
    }

    @Inject(at = @At("HEAD"), method = "supportedFormats()Lnet/minecraft/util/InclusiveRange;", cancellable = true)
    private void supportedFormats_2050498315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2050498315L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void description__40130642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-40130642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forPackType(Lnet/minecraft/server/packs/PackType;)Lnet/minecraft/server/packs/metadata/MetadataSectionType;", cancellable = true)
    private static void forPackType_343282097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(343282097L))
            info.setReturnValue(null);
    }


}
