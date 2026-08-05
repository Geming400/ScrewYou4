package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.metadata.PackMetadataGenerator.class)
public class PackMetadataGenerator_863143427Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1025703476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1025703476L))
            info.setReturnValue("C\u01F951\uFD0B\u8486F&\u035C;I4{V<eBi.!L$h&dNR[G\uFCF6");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_962869169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(962869169L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/packs/metadata/MetadataSectionType;Ljava/lang/Object;)Lnet/minecraft/data/metadata/PackMetadataGenerator;", cancellable = true)
    private void add_107131329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(107131329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forFeaturePack(Lnet/minecraft/data/PackOutput;Lnet/minecraft/network/chat/Component;Lnet/minecraft/world/flag/FeatureFlagSet;)Lnet/minecraft/data/metadata/PackMetadataGenerator;", cancellable = true)
    private static void forFeaturePack__673964799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-673964799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forFeaturePack(Lnet/minecraft/data/PackOutput;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/data/metadata/PackMetadataGenerator;", cancellable = true)
    private static void forFeaturePack__767240984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-767240984L))
            info.setReturnValue(null);
    }


}
