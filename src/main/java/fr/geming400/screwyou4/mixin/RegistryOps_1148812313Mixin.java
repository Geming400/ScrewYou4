package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.RegistryOps.class)
public class RegistryOps_1148812313Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_240185548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(240185548L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1706163907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1706163907L))
            info.setReturnValue(579370667);
    }

    @Inject(at = @At("HEAD"), method = "owner(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void owner_1374600431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1374600431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lcom/mojang/serialization/DynamicOps;Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/resources/RegistryOps;", cancellable = true)
    private static void create_632027403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(632027403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lcom/mojang/serialization/DynamicOps;Lnet/minecraft/resources/RegistryOps$RegistryInfoLookup;)Lnet/minecraft/resources/RegistryOps;", cancellable = true)
    private static void create__938459796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-938459796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getter(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void getter__1544297065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1544297065L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "injectRegistryContext(Lcom/mojang/serialization/Dynamic;Lnet/minecraft/core/HolderLookup$Provider;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void injectRegistryContext__1797588460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1797588460L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retrieveElement(Lnet/minecraft/resources/ResourceKey;)Lcom/mojang/serialization/codecs/RecordCodecBuilder;", cancellable = true)
    private static void retrieveElement_1350175872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1350175872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retrieveGetter(Lnet/minecraft/resources/ResourceKey;)Lcom/mojang/serialization/codecs/RecordCodecBuilder;", cancellable = true)
    private static void retrieveGetter__1976991591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1976991591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withParent(Lcom/mojang/serialization/DynamicOps;)Lnet/minecraft/resources/RegistryOps;", cancellable = true)
    private void withParent__1128802101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1128802101L))
            info.setReturnValue(null);
    }


}
