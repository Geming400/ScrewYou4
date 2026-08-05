package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.RegistryOps.class)
public class RegistryOps_1148812313Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1760643221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1760643221L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1187074558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1187074558L))
            info.setReturnValue(-942170579);
    }

    @Inject(at = @At("HEAD"), method = "owner(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void owner__1170906430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1170906430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lcom/mojang/serialization/DynamicOps;Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/resources/RegistryOps;", cancellable = true)
    private static void create_257121295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(257121295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lcom/mojang/serialization/DynamicOps;Lnet/minecraft/resources/RegistryOps$RegistryInfoLookup;)Lnet/minecraft/resources/RegistryOps;", cancellable = true)
    private static void create__2097411728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2097411728L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getter(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void getter__1170906430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1170906430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retrieveGetter(Lnet/minecraft/resources/ResourceKey;)Lcom/mojang/serialization/codecs/RecordCodecBuilder;", cancellable = true)
    private static void retrieveGetter_1481290656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1481290656L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "injectRegistryContext(Lcom/mojang/serialization/Dynamic;Lnet/minecraft/core/HolderLookup$Provider;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void injectRegistryContext__272469133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-272469133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retrieveElement(Lnet/minecraft/resources/ResourceKey;)Lcom/mojang/serialization/codecs/RecordCodecBuilder;", cancellable = true)
    private static void retrieveElement_1481290656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1481290656L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withParent(Lcom/mojang/serialization/DynamicOps;)Lnet/minecraft/resources/RegistryOps;", cancellable = true)
    private void withParent_2082732987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2082732987L))
            info.setReturnValue(null);
    }


}
