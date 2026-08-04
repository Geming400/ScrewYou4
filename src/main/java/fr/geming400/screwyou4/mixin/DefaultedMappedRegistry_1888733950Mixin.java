package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.DefaultedMappedRegistry.class)
public class DefaultedMappedRegistry_1888733950Mixin {
        @Inject(at = @At("HEAD"), method = "getValue(Lnet/minecraft/resources/Identifier;)Ljava/lang/Object;", cancellable = true)
    private void getValue__359934704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-359934704L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getKey(Ljava/lang/Object;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getKey_2100601640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2100601640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/resources/ResourceKey;Ljava/lang/Object;Lnet/minecraft/core/RegistrationInfo;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void register__1215513978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1215513978L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId(Ljava/lang/Object;)I", cancellable = true)
    private void getId__1020737921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1020737921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandom(Lnet/minecraft/util/RandomSource;)Ljava/util/Optional;", cancellable = true)
    private void getRandom__364963061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-364963061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOptional(Lnet/minecraft/resources/Identifier;)Ljava/util/Optional;", cancellable = true)
    private void getOptional_1554842403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1554842403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultKey()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getDefaultKey__554332604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-554332604L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Ljava/lang/Object;", cancellable = true)
    private void byId__832450241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-832450241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAny()Ljava/util/Optional;", cancellable = true)
    private void getAny_2134195371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2134195371L))
            info.setReturnValue(null);
    }


}
