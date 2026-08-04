package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.metadata.PackMetadataGenerator.class)
public class PackMetadataGenerator_863143427Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__272317045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-272317045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_1589665884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589665884L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/packs/metadata/MetadataSectionType;Ljava/lang/Object;)Lnet/minecraft/data/metadata/PackMetadataGenerator;", cancellable = true)
    private void add__423367328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-423367328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forFeaturePack(Lnet/minecraft/data/PackOutput;Lnet/minecraft/network/chat/Component;Lnet/minecraft/world/flag/FeatureFlagSet;)Lnet/minecraft/data/metadata/PackMetadataGenerator;", cancellable = true)
    private static void forFeaturePack_1499719399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1499719399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forFeaturePack(Lnet/minecraft/data/PackOutput;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/data/metadata/PackMetadataGenerator;", cancellable = true)
    private static void forFeaturePack__1867442110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1867442110L))
            info.setReturnValue(null);
    }


}
